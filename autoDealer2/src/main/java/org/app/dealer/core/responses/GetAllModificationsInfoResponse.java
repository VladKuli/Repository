package org.app.dealer.core.responses;

import lombok.Getter;
import org.app.dealer.core.domain.ModificationsInfo;

import java.util.List;

@Getter
public class GetAllModificationsInfoResponse {

    private List<ModificationsInfo> modificationsInfoList;

    public GetAllModificationsInfoResponse(List<ModificationsInfo> modificationsInfoList) {
        this.modificationsInfoList = modificationsInfoList;
    }
}