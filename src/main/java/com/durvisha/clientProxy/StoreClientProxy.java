package com.durvisha.clientProxy;

import com.durvisha.fallbackFactory.StoreClientFallbackFactory;
import com.durvisha.model.Store;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "STORE-SERVICE", value = "STORE-SERVICE",
        url = "localhost:8086", path = "/api/v1",
        contextId = "StoreClientProxy", qualifier = "StoreClientProxy",
         fallbackFactory = StoreClientFallbackFactory.class)
public interface StoreClientProxy {
    @GetMapping(value = "/store")
    public ResponseEntity<List<Store>> getStoreList();
}
