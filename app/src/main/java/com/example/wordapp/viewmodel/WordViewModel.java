package com.example.wordapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.wordapp.entity.Word;
import com.example.wordapp.repository.WordRepository;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private final LiveData<List<Word>> mAllWord;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWord = mRepository.getAllWord();
    }

    public LiveData<List<Word>> getAllWords(){
        return mAllWord;
    }

    public void insert(Word word){
        mRepository.insert(word);
    }
}
