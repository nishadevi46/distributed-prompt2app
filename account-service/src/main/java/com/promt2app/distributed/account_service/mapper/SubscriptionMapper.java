package com.promt2app.distributed.account_service.mapper;


import com.promt2app.distributed.account_service.dto.subscription.SubscriptionResponse;
import com.promt2app.distributed.account_service.entity.Plan;
import com.promt2app.distributed.account_service.entity.Subscription;
import com.promt2app.distributed.common_lib.dto.PlanDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanDto toPlanResponse(Plan plan);
}

