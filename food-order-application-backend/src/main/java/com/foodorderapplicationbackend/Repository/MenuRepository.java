package com.foodorderapplicationbackend.Repository;

import com.foodorderapplicationbackend.Menu.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity,Long> {
}
