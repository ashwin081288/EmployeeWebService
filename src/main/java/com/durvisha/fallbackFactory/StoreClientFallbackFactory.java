package com.durvisha.fallbackFactory;

import com.durvisha.clientProxy.StoreClientProxy;
import com.durvisha.model.Store;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Slf4j
@Component("storeClientFallbackFactory")
public class StoreClientFallbackFactory implements FallbackFactory<StoreClientProxy> {
    @Override
    public StoreClientProxy create(Throwable cause) {
        return () -> {
            LoggerFactory.getLogger("hello!! fallback reason was " + cause.getMessage());
            System.out.println("hello!! fallback reason was " + cause.getMessage());
            return ResponseEntity.ok().build();
            // return "fallback; reason was: " + cause.getMessage();
        };
    }
}
/*
public class StoreFallback implements StoreClientProxy {
    @Override
    public String loadPage() {
        return null;
    }
}
*/
