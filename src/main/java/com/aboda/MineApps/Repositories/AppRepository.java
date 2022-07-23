package com.aboda.MineApps.Repositories;

import com.aboda.MineApps.Model.APP;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface AppRepository extends JpaRepository<APP,Integer> {

    @Query(value = "SELECT * FROM mineapp.app o where\n" +
            "o.app_type=?;",nativeQuery = true)
    public List<APP> fetchByAppType(String name);

    @Query(value = "SELECT * FROM mineapp.app o where\n" +
            "o.app_name like %?% ;",nativeQuery = true)
    public List<APP> fetchByAppName(String name);
}
