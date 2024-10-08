package com.victorfmag.exercicio1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikesViewModel extends ViewModel {
    private MutableLiveData<String> nome = new MutableLiveData<>("Victor");
    private MutableLiveData<String> sobrenome = new MutableLiveData<>("Fernandes");
    private MutableLiveData<Integer> imagemLikes = new MutableLiveData<>(R.drawable.baseline_thumb_up_24_white);
    private MutableLiveData<Integer> likes = new MutableLiveData<>(0);

    public void darLike() {
        Integer valorAtualLikes = likes.getValue();
        if (valorAtualLikes != null) {
            likes.setValue(valorAtualLikes + 1);

            if (valorAtualLikes + 1 <= 3) {
                imagemLikes.setValue(R.drawable.baseline_thumb_up_24_white);
            } else if (valorAtualLikes + 1 > 3 && valorAtualLikes + 1 <= 9) {
                imagemLikes.setValue(R.drawable.heart);
            } else if (valorAtualLikes + 1 > 9) {
                imagemLikes.setValue(R.drawable.baseline_local_fire_department_24_white);
            }
        }
    }

    public MutableLiveData<String> getNome() {
        return nome;
    }

    public MutableLiveData<String> getSobrenome() {
        return sobrenome;
    }

    public MutableLiveData<Integer> getImagemLikes() {
        return imagemLikes;
    }

    public MutableLiveData<Integer> getLikes() {
        return likes;
    }
}
