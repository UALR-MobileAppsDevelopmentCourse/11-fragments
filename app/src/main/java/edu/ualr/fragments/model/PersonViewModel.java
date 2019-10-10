package edu.ualr.fragments.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by irconde on 2019-10-10.
 */

// TODO 01. We create the ViewModel class used to communicate both fragments
public class PersonViewModel extends ViewModel {

    MutableLiveData<Person> personData;

    public PersonViewModel() {
        personData = new MutableLiveData<>();
    }

    public void setPerson(String firstName, String lastName, int age) {
        Person currentPersonData = personData.getValue();
        if (currentPersonData == null) {
            currentPersonData = new Person();
        }
        currentPersonData.setData(firstName, lastName, age);
        personData.setValue(currentPersonData);
    }

    public LiveData<Person> getPerson() {
        return this.personData;
    }

}
