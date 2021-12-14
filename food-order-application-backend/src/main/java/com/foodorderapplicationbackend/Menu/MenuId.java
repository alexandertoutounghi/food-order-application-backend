package com.foodorderapplicationbackend.Menu;

import javax.persistence.IdClass;
import java.io.Serializable;


public class MenuId implements Serializable {
   private Long menuId;
   private Long mealID;

   public MenuId(Long menuId, Long mealID) {
      this.menuId = menuId;
      this.mealID = mealID;
   }
}
