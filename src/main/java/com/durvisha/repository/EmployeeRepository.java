package com.durvisha.repository;

import com.durvisha.model.Store;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeRepository {
    public ResponseEntity<List<Store>> getStoreClientProxy();

}
