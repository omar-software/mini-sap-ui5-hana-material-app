package com.omar.saphana.service;

import com.omar.saphana.entity.Material;
import com.omar.saphana.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    // Alle Materialien laden
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    // Neues Material speichern
    public Material createMaterial(Material material) {
        return materialRepository.save(material);
    }

    // Material nach Materialnummer oder Name suchen
    public List<Material> searchMaterials(String keyword) {
        return materialRepository
                .findByMaterialNumberContainingIgnoreCaseOrNameContainingIgnoreCase(keyword, keyword);
    }

    // Materialien mit niedrigem Bestand anzeigen
    public List<Material> getLowStockMaterials() {
        return materialRepository.findAll()
                .stream()
                .filter(material -> material.getCurrentStock() <= material.getMinimumStock())
                .toList();
    }
}
