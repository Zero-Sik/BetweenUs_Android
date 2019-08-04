package org.techtown.betweenus_android.network.client;

import org.techtown.betweenus_android.base.BaseClient;
import org.techtown.betweenus_android.manager.Token;
import org.techtown.betweenus_android.model.Study;
import org.techtown.betweenus_android.network.api.StudyApi;
import org.techtown.betweenus_android.network.request.StudyApplyRequest;
import org.techtown.betweenus_android.network.request.StudyRequest;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Response;

public class StudyClient extends BaseClient<StudyApi> {
    @Override
    protected Class api() {
        return StudyApi.class;
    }

    public Single<List<Study>> getStudyList(Token token) {
        return api.getStudyList(token.getToken()).map(getResponseObjectsFunction());
    }

    public Single<String> postCreateStudy(Token token, StudyRequest studyRequest) {
        return api.postCreateStudy(token.getToken(), studyRequest).map(Response::message);
    }

    public Single<String> postCreateApplyStudy(Token token, StudyApplyRequest studyApplyRequest) {
        return api.postCreateStudyApply(token.getToken(), studyApplyRequest).map(getResponseObjectsFunction());
    }
}
