package com.example.system.pojo;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReserveInformation {
    public Integer cId;
    public Integer msId;
    public Integer riProcess;
    public String riProcessDetail;
    public String riProcessPhotosLink;
    public Integer riEvaluation;
    public String riEvaluationText;
}