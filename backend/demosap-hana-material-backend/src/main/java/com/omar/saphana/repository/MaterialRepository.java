package com.omar.saphana.repository;

import com.omar.saphana.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialRepository extends JpaRepository<Material, Long> {

    // Suche nach Materialnummer oder Materialname
    List<Material> findByMaterialNumberContainingIgnoreCaseOrNameContainingIgnoreCase(
            String materialNumber,
            String name
    );
}
