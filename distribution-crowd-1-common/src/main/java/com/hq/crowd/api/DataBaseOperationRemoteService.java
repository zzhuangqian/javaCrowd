package com.hq.crowd.api;

import com.hq.crowd.entity.MemberPO;
import com.hq.crowd.entity.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("database-provider")
public interface DataBaseOperationRemoteService {
    @RequestMapping("/retrieve/login/acct/count")
    ResultEntity<Integer> retrieveLoginAccount(@RequestParam("loginAcct") String loginAcct);

    ResultEntity<String> saveMemberRemote(@RequestBody MemberPO memberPO);

}
