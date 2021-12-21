package com.foodorderapplicationbackend.Menu;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MenuId implements Serializable {
   @Column(name="mealId")
   private Long mealId;

   public MenuId(Long mealId) {
      this.mealId = mealId;
   }

   public MenuId() {

   }
}
