package org.techtown.betweenus_android.network.api;

import org.techtown.betweenus_android.model.Study;
import org.techtown.betweenus_android.model.StudyList;
import org.techtown.betweenus_android.network.Response;
import org.techtown.betweenus_android.network.request.StudyApplyRequest;
import org.techtown.betweenus_android.network.request.StudyIdxRequest;
import org.techtown.betweenus_android.network.request.StudyRequest;

import java.util.List;

import io.reactivex.Single;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface StudyApi {

    @GET("/study")
    Single<retrofit2.Response<Response<List<Study>>>> getStudyList(@Header("x-access-token") String token);

    @POST("/study")
    Single<retrofit2.Response<Response>> postCreateStudy(@Header("x-access-token") String token,
                                                         @Body StudyRequest studyRequest);

    @GET("/study/me")
    Single<retrofit2.Response<Response<StudyList>>> getMyStudy(@Header("x-access-token") String token);

    @POST("/study/apply")
    Single<retrofit2.Response<Response<String>>> postCreateStudyApply(@Header("x-access-token") String token,
                                                              @Body StudyApplyRequest studyApplyRequest);

    @POST("/study/end")
    Single<retrofit2.Response<Response>> postStudyEnd(@Header("x-access-token") String token,
                                                      @Body StudyIdxRequest studyIdxRequest);

    @POST
    Single<retrofit2.Response<Response>> postQr(@Header("x-access-token") String token, @Url String url);

    @DELETE("/study/apply")
    Single<retrofit2.Response<Response>> deleteStudyMember();

    @GET("/study/past")
    Single<retrofit2.Response<Response>> getStudyingList();

    @POST("/study/past")
    Single<retrofit2.Response<Response>> postStudyChangeStatus();
}
