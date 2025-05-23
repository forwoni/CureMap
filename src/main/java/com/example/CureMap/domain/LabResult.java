package com.example.CureMap.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LabResult {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String specimenName;         // 검체명 (예: 소변, 혈액)
    private String mainTestName;         // 검사명 (예: 요검사, 혈액 검사)
    private String mainTestResult;       // 수치결과내용 (예: WBC 15,000)
    private String subTestName;          // 부검사명 (예: Protein)
    private String subTestResult;        // 부검사 결과내용 (예: Negative)

}
