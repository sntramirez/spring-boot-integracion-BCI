package com.integracion.crud.model.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.integracion.crud.security.enums.RolNombre;

@Entity
@Table(name = "TB_ROLES")
public class Rol implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;

	public Rol() {
	}

	public Rol(@NotNull RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}

}
