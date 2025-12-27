package com.ygseol.gui.ygseol.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_drug_info")
public class DrugInfoRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    String HELT_ITM_GRP_CD;

    String HELT_ITM_GRP_NM;

    String LCLAS_CD;

    String LCLAS_NM;

    String MLSFC_CD;

    String MLSFC_NM;

    String SCLAS_CD;

    String SCLAS_NM;
}

