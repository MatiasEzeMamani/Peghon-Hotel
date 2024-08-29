import React from "react";
import { NavLink, useNavigate } from "react-router-dom";
import ApiService from "../../service/ApiService";

function Navbar() {
  const isAutheticated = ApiService.isAuthenticated();
  const isAdmin = ApiService.isAdmin();
  const isUser = ApiService.isUser();
  const navigate = useNavigate();

  const handleLogout = () => {
    const isLogout = window.confirm(
      "¿Estás segura de que realmente quieres cerrar sesión?"
    );
    if (isLogout) {
      ApiService.logout();
      navigate("/home");
    }
  };

  return (
    <nav className="navbar">
      <div className="navbar-brand">
        <NavLink to="/home">Peghon Hotel</NavLink>
      </div>
      <ul className="navbar-ul">
        <li>
          <NavLink to="/home" activeclass="active">
            Inicio
          </NavLink>
        </li>
        <li>
          <NavLink to="/rooms" activeclass="active">
            Habitaciones
          </NavLink>
        </li>
        <li>
          <NavLink to="/find-booking" activeclass="active">
            Buscar mi Reserva
          </NavLink>
        </li>

        {isUser && (
          <li>
            <NavLink to="/profile" activeclass="active">
              Perfil
            </NavLink>
          </li>
        )}
        {isAdmin && (
          <li>
            <NavLink to="/admin" activeclass="active">
              Administrador
            </NavLink>
          </li>
        )}

        {!isAutheticated && (
          <li>
            <NavLink to="/login" activeclass="active">
              Iniciar Sesión
            </NavLink>
          </li>
        )}
        {!isAutheticated && (
          <li>
            <NavLink to="/register" activeclass="active">
              Registrarse
            </NavLink>
          </li>
        )}

        {isAutheticated && <li onClick={handleLogout}>Cerrar Sesión</li>}
      </ul>
    </nav>
  );
}

export default Navbar;
