package com.durvisha.repository.impl;

import com.durvisha.clientProxy.StoreClientProxy;
import com.durvisha.model.Store;
import com.durvisha.repository.EmployeeRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
    /* @Autowired
     ObjectProvider<StoreClientProxy> storeClientProxy;*/
    @Autowired
    @Qualifier("StoreClientProxy")
    private StoreClientProxy storeClientProxy;

    /*  @Autowired
      @Qualifier("storeClientFallbackFactory")
      private StoreClientFallbackFactory storeClientFallbackFactory;
  */

    @Override
    public ResponseEntity<List<Store>> getStoreClientProxy() {
        return storeClientProxy.getStoreList();
    }
}
