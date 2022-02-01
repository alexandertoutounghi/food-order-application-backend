package com.foodorderapplicationbackend.User.Vendor;

import com.foodorderapplicationbackend.Menu.MenuEntity;
import com.foodorderapplicationbackend.User.EndUser.EndUserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="Vendor")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "Vendor")
public class Vendor  {
   @Id
   @SequenceGenerator(
           name = "vendor_sequence",
           sequenceName = "vendor_sequence",
           allocationSize = 1
   )
   @GeneratedValue(
           strategy = GenerationType.SEQUENCE,
           generator = "vendor_sequence"
   )
   @Column(
           name = "vendorId",
           updatable = false,
           nullable = false
   )
   private Long vendorId;

   @Column(
           name="businessName",
           updatable = true,
           nullable = false,
           columnDefinition = "TEXT"
   )
   private String businessName;

   @Column(
           name="bizAddress",
           updatable = true,
           nullable = false,
           columnDefinition = "TEXT"
   )
   private String bizAddress;

   @OneToOne(
           mappedBy = "vendor"
//           cascade = CascadeType.ALL
   )
   private MenuEntity menu;


   public Vendor(String businessName, String bizAddress, MenuEntity menu) {
      this.businessName = businessName;
      this.bizAddress = bizAddress;
      this.menu = menu;
   }

   public Vendor(String businessName, String bizAddress) {
      this.businessName = businessName;
      this.bizAddress = bizAddress;
   }
}
