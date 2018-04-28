package com.dekinci.lksbstu.communication;

import com.dekinci.lksbstu.communication.structure.Gradebook;
import com.dekinci.lksbstu.communication.structure.Login;
import com.dekinci.lksbstu.communication.structure.Schedule;
import com.dekinci.lksbstu.communication.structure.User;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServerApi {
    @GET("getUserInfo")
    Call<User> getUserInfo(String user_id);

    @GET("login")
    Call<Login> login(String login, String password);

    @GET("getSchedule")
    Call<List<Schedule>> getSchedule(String group_id, int type);

    @GET("getGradebook")
    Call<Gradebook> getGradebook(String user_id);

    @POST("sendTask")
    void sendTask(String user_id, String group_id, String msg);
}
