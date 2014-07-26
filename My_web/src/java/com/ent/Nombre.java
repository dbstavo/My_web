/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ent;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dokie
 */
@Entity
@Table(name = "nombre", catalog = "test", schema = "")
@XmlRootElement
@NamedQueries({
   @NamedQuery(name = "Nombre.findAll", query = "SELECT n FROM Nombre n"),
   @NamedQuery(name = "Nombre.findByIdNombre", query = "SELECT n FROM Nombre n WHERE n.idNombre = :idNombre"),
   @NamedQuery(name = "Nombre.findByNombrecol", query = "SELECT n FROM Nombre n WHERE n.nombrecol = :nombrecol"),
   @NamedQuery(name = "Nombre.findByApellido", query = "SELECT n FROM Nombre n WHERE n.apellido = :apellido"),
   @NamedQuery(name = "Nombre.findByFechanac", query = "SELECT n FROM Nombre n WHERE n.fechanac = :fechanac")})
public class Nombre implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "idNombre", nullable = false)
   private Integer idNombre;
   @Basic(optional = false)
   @NotNull
   @Size(min = 1, max = 45)
   @Column(name = "Nombrecol", nullable = false, length = 45)
   private String nombrecol;
   @Basic(optional = false)
   @NotNull
   @Size(min = 1, max = 45)
   @Column(name = "Apellido", nullable = false, length = 45)
   private String apellido;
   @Basic(optional = false)
   @NotNull
   @Column(name = "Fecha_nac", nullable = false)
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechanac;

   public Nombre() {
   }

   public Nombre(Integer idNombre) {
      this.idNombre = idNombre;
   }

   public Nombre(Integer idNombre, String nombrecol, String apellido, Date fechanac) {
      this.idNombre = idNombre;
      this.nombrecol = nombrecol;
      this.apellido = apellido;
      this.fechanac = fechanac;
   }

   public Integer getIdNombre() {
      return idNombre;
   }

   public void setIdNombre(Integer idNombre) {
      this.idNombre = idNombre;
   }

   public String getNombrecol() {
      return nombrecol;
   }

   public void setNombrecol(String nombrecol) {
      this.nombrecol = nombrecol;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public Date getFechanac() {
      return fechanac;
   }

   public void setFechanac(Date fechanac) {
      this.fechanac = fechanac;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (idNombre != null ? idNombre.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Nombre)) {
         return false;
      }
      Nombre other = (Nombre) object;
      if ((this.idNombre == null && other.idNombre != null) || (this.idNombre != null && !this.idNombre.equals(other.idNombre))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.ent.Nombre[ idNombre=" + idNombre + " ]";
   }
   
}
