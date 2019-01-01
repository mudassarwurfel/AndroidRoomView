package wurfel.com.roomwordsample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by ${Muddassar} on 12/27/2018.
 */
@Dao
public interface WordDao {
    @Insert
    void insert(Word word);

    @Query("Delete from word_table ")
    void deleteAll();

    @Query("Select * from word_table order by Word Asc")
    LiveData<List<Word>> getAllwords();
}
