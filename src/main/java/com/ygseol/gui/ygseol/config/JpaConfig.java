package com.ygseol.gui.ygseol.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * 기본 JPA 설정 헬퍼.
 * persistence.xml 의 persistence-unit 이름: ygseolPU
 */
public final class JpaConfig {
    private static final EntityManagerFactory emf = buildFactory();

    private JpaConfig() {
    }

    private static EntityManagerFactory buildFactory() {
        try {
            return Persistence.createEntityManagerFactory("ygseolPU");
        } catch (Exception e) {
            throw new IllegalStateException("JPA 초기화 실패", e);
        }
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void shutdown() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
}

