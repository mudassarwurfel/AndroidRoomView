package wurfel.com.roomwordsample;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by ${Muddassar} on 12/27/2018.
 */
@Entity(tableName = "Word_Table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Word")
    private String Word;


    public Word(@NonNull String Word) {
        this.Word = Word;
    }

    @NonNull
    public String getWord() {
        return Word;
    }
}
