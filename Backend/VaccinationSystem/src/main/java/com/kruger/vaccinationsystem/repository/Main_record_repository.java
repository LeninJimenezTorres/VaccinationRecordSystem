//CREO LA INTERACCION CON LA BASE DE DATOS DE LA TABLA DE REGISTROS PRIMARIOS
package com.kruger.vaccinationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.vaccinationsystem.model.Main_record;

public interface Main_record_repository extends JpaRepository<Main_record, Long>{

}
