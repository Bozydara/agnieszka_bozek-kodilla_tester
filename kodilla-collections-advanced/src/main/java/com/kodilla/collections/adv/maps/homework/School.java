package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> pupilsInClasses = new ArrayList<>();
    private String schoolName;

    public School(List<Integer> pupils, String schoolName) {
        this.pupilsInClasses = pupils;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int countTotalPupils() {
        int totalPupilsNumber = 0;
        for (int i = 0; i < pupilsInClasses.size(); i++) {
            totalPupilsNumber += pupilsInClasses.get(i);
        }
        return totalPupilsNumber;
    }
}