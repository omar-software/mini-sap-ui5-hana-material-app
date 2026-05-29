package com.omar.saphana.controller;

import com.omar.saphana.entity.Material;
import com.omar.saphana.service.MaterialService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/odata/materials")
@CrossOrigin(origins = "*")
public class MaterialController {

    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    // OData-style Entity Set:
    // GET /api/odata/materials
    @GetMapping
    public List<Material> getAllMaterials() {
        return materialService.getAllMaterials();
    }

    // OData-style Create:
    // POST /api/odata/materials
    @PostMapping
    public Material createMaterial(@Valid @RequestBody Material material) {
        return materialService.createMaterial(material);
    }

    // OData-style Filter:
    // GET /api/odata/materials/search?keyword=MAT
    @GetMapping("/search")
    public List<Material> searchMaterials(@RequestParam String keyword) {
        return materialService.searchMaterials(keyword);
    }

    // OData-style Entity Set:
    // GET /api/odata/materials/low-stock
    @GetMapping("/low-stock")
    public List<Material> getLowStockMaterials() {
        return materialService.getLowStockMaterials();
    }
}
