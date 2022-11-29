package com.smer.actas.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Container(containerName = "persona",ru = "400")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona {
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("primer_apellido")
    private String primerApellido;
    @JsonProperty("segundo_apellido")
    private String segundoApellido;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("fecha_nacimiento")
    private Date fechaNacimiento;
    @JsonProperty("lugar_nacimiento")
    private String lugarNacimiento;
    @PartitionKey
    @JsonProperty("curp")
    private String curp;
    @Id
    @JsonProperty("identificador_electronico")
    private String identificadorElectronico;
    @JsonProperty("nombre_papa")
    private String nombrePapa;
    @JsonProperty("primer_apellido_papa")
    private String primerApellidoPapa;
    @JsonProperty("segundo_apellido_papa")
    private String segundoApellidoPapa;
    @JsonProperty("nacionalidad_papa")
    private String nacionalidadPapa;
    @JsonProperty("curp_papa")
    private String curpPapa;
    @JsonProperty("nombre_mama")
    private String nombreMama;
    @JsonProperty("primer_apellido_mama")
    private String primerApellidoMama;
    @JsonProperty("segundo_apellido_mama")
    private String segundoApellidoMama;
    @JsonProperty("nacionalidad_mama")
    private String nacionalidadMama;
    @JsonProperty("curp_mama")
    private String curpMama;
    @JsonProperty("certificado_nacimiento_ssa")
    private String certificadonacimientoSSA;
    @JsonProperty("lugar_registro")
    private String lugarRegistro;
    @JsonProperty("anotaciones_marginales")
    private String anotacionesMarginales;
    @JsonProperty("certificacion")
    private String certificacion;
    @JsonProperty("transcipcion")
    private String transcipcion;
    @JsonProperty("cadenaActo")
    private String cadenaActo;
    @JsonProperty("fechaRegistro")
    private Date fechaRegistro;
    @JsonProperty("oficialia")
    private String oficialia;
    @JsonProperty("libro")
    private String libro;
    @JsonProperty("foja")
    private String foja;
    @JsonProperty("tomo")
    private String tomo;
    @JsonProperty("acta")
    private String acta;

}
