package com.dekinci.lksbstu.communication.structure;

import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("data")
    private String data;

    @SerializedName("lessonType")
    private String lessonType;

    @SerializedName("lesson")
    private String lesson;

    @SerializedName("teacher")
    private String teacher;

    @SerializedName("place")
    private String place;


    public Schedule(String data, String lessonType, String lesson, String teacher, String place) {
        this.data = data;
        this.lessonType = lessonType;
        this.lesson = lesson;
        this.teacher = teacher;
        this.place = place;
    }

    public Schedule(){}


    public String getData(){
        return data;
    }

    public String getLessonType() {
        return lessonType;
    }

    public String getLesson() {
        return lesson;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getPlace() {
        return place;
    }

}
