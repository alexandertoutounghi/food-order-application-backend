package com.foodorderapplicationbackend.Menu;

import com.foodorderapplicationbackend.Meal.MealEntity;
import com.foodorderapplicationbackend.User.Vendor.Vendor;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name="Menu")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Menu")
@ToString(exclude = "vendor")
public class MenuEntity {
    @Id
    @SequenceGenerator(
            name="menu_entity_sequence",
            sequenceName = "menu_entity_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "menu_entity_sequence"
    )
    private Long menuId;

    @Column(
            name = "menuName",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String menuName;

//    Cascade to set data for one to one
//    fetch to get data either all data for related tables (EAGER)  or just for that table itself (LAZY)
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name="vendorId",
            referencedColumnName = "vendorId"
    )
    private Vendor vendor;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name="menu_id",
            referencedColumnName = "menuId"
    )
    private List<MealEntity> meals;

    public MenuEntity(String menuName, Vendor vendor) {
        this.menuName = menuName;
        this.vendor = vendor;
    }


    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<MealEntity> getMeals() {
        return meals;
    }

    public void setMeals(List<MealEntity> meals) {
        this.meals = meals;
    }
    //    @OneToMany(targetEntity = MealEntity.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "mealForeignKey",referencedColumnName = "mealId")
//    private List<MealEntity> Menu;
}
