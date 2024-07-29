package com.ohgiraffers.blog.service;

import com.ohgiraffers.blog.model.dto.JaeheeDTO;
import com.ohgiraffers.blog.model.entity.JaeheeEntity;
import com.ohgiraffers.blog.repository.JaeheeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JaeheeService {

    private final JaeheeRepository jaeheeRepository;

    @Autowired
    public JaeheeService(JaeheeRepository jaeheeRepository) {
        this.jaeheeRepository = jaeheeRepository;
    }

    private Long id; //primary key 값
    private String materialId; //자재 ID
    private String process; // 공정
    private String storage; // 창고
    private String materialName; //자재이름
    private Integer amount; //자재수량
    private String ingredient; // 자재재질
    private Integer weight; //자재중량
    private String incomming_date; //입고일자
    private String description; //비고


    public List<JaeheeDTO> getAllPosts() {
        List<JaeheeEntity> entities = jaeheeRepository.findAll();
        return entities.stream()
                .map(entity -> new JaeheeDTO(entity.getId(), entity.getMaterialId(), entity.getProcess(), entity.getStorage(), entity.getMaterialName(),
                        entity.getAmount(), entity.getIngredient(), entity.getWeight(), entity.getIncomming_date(), entity.getDescription()))
                .collect(Collectors.toList());
    }
    @Transactional
    public void save(JaeheeDTO jaeheeDTO) {
        JaeheeEntity entity = new JaeheeEntity();
        entity.setId(jaeheeDTO.getId());
        entity.setMaterialId(jaeheeDTO.getMaterialId());
        entity.setProcess(jaeheeDTO.getProcess());
        entity.setStorage(jaeheeDTO.getStorage());
        entity.setMaterialName(jaeheeDTO.getMaterialName());
        entity.setAmount(jaeheeDTO.getAmount());
        entity.setIngredient(jaeheeDTO.getIngredient());
        entity.setWeight(jaeheeDTO.getWeight());
        entity.setIncomming_date(jaeheeDTO.getIncomming_date());
        entity.setDescription(jaeheeDTO.getDescription());
        jaeheeRepository.save(entity);
    }

    public JaeheeEntity findById(Long id) {
        return jaeheeRepository.findById(id).orElse(null);
    }

    public void deletePostById(Long id) {
        jaeheeRepository.deleteById(id);
    }

    public void update(JaeheeDTO jaeheeDTO) {
        JaeheeEntity jaeheeEntity = jaeheeRepository.findById(jaeheeDTO.getId()).orElseThrow(() -> new IllegalArgumentException("Invalid post ID"));
        jaeheeEntity.setId(jaeheeDTO.getId());
        jaeheeEntity.setMaterialId(jaeheeDTO.getMaterialId());
        jaeheeEntity.setProcess(jaeheeDTO.getProcess());
        jaeheeEntity.setStorage(jaeheeDTO.getStorage());
        jaeheeEntity.setMaterialName(jaeheeDTO.getMaterialName());
        jaeheeEntity.setAmount(jaeheeDTO.getAmount());
        jaeheeEntity.setIngredient(jaeheeDTO.getIngredient());
        jaeheeEntity.setWeight(jaeheeDTO.getWeight());
        jaeheeEntity.setIncomming_date(jaeheeDTO.getIncomming_date());
        jaeheeEntity.setDescription(jaeheeDTO.getDescription());
        jaeheeRepository.save(jaeheeEntity);
    }
}
