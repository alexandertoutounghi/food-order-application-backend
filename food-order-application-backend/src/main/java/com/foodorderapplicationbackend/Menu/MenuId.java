package com.foodorderapplicationbackend.Menu;

import javax.persistence.IdClass;
import java.io.Serializable;


public class MenuId implements Serializable {
   private Long mealId;

   public MenuId(Long mealId) {
      this.mealId = mealId;
   }
}
