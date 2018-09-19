package bicmsystems.com.br.meusjogos.model

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class Jogo (
        val resourceId: Int,
        val titulo: String,
        val anoLancamento: Int,
        val descricao: String) : Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(resourceId)
        parcel.writeString(titulo)
        parcel.writeInt(anoLancamento)
        parcel.writeString(descricao)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Jogo> {
        override fun createFromParcel(parcel: Parcel): Jogo {
            return Jogo(parcel)
        }

        override fun newArray(size: Int): Array<Jogo?> {
            return arrayOfNulls(size)
        }
    }


}