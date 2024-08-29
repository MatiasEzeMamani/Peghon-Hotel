import React, { useState } from "react";
import RoomResult from "../common/RoomResult";
import RoomSearch from "../common/RoomSearch";

const HomePage = () => {
  const [roomSearchResults, setRoomSearchResults] = useState([]);

  // Function to handle search results
  const handleSearchResult = (results) => {
    setRoomSearchResults(results);
  };

  return (
    <div className="home">
      {/* HEADER / BANNER ROOM SECTION */}
      <section>
        <header className="header-banner">
          <img
            src="./assets/images/hotel.webp"
            alt="Phegon Hotel"
            className="header-image"
          />
          <div className="overlay"></div>
          <div className="animated-texts overlay-content">
            <h1>
              Bienvenido a <span className="phegon-color">Peghon Hotel</span>
            </h1>
            <br />
            <h3>Entra en un refugio de confort y cuidado</h3>
          </div>
        </header>
      </section>

      {/* SEARCH/FIND AVAILABLE ROOM SECTION */}
      <RoomSearch handleSearchResult={handleSearchResult} />
      <RoomResult roomSearchResults={roomSearchResults} />

      <h2 className="home-services">
        Servicios en <span className="phegon-color">Peghon Hotel</span>
      </h2>

      {/* SERVICES SECTION */}
      <section className="service-section">
        <div className="service-card">
          <img src="./assets/images/ac.png" alt="Air Conditioning" />
          <div className="service-details">
            <h3 className="service-title">Aire Acondicionado</h3>
            <p className="service-description">
              Mantente fresco y cómodo durante tu estancia con nuestro aire
              acondicionado en la habitación, controlado individualmente.
            </p>
          </div>
        </div>
        <div className="service-card">
          <img src="./assets/images/mini-bar.png" alt="Mini Bar" />
          <div className="service-details">
            <h3 className="service-title">Mini Bar</h3>
            <p className="service-description">
              Disfruta de una selección conveniente de bebidas y bocadillos en
              el mini bar de tu habitación sin costo adicional.
            </p>
          </div>
        </div>
        <div className="service-card">
          <img src="./assets/images/parking.png" alt="Parking" />
          <div className="service-details">
            <h3 className="service-title">Parking</h3>
            <p className="service-description">
              Ofrecemos estacionamiento en el lugar para tu comodidad. Consulta
              sobre opciones de estacionamiento con valet si están disponibles.
            </p>
          </div>
        </div>
        <div className="service-card">
          <img src="./assets/images/wifi.png" alt="WiFi" />
          <div className="service-details">
            <h3 className="service-title">WiFi</h3>
            <p className="service-description">
              Mantente conectado durante tu estancia con acceso Wi-Fi de alta
              velocidad complementario disponible en todas las habitaciones y
              áreas públicas.
            </p>
          </div>
        </div>
      </section>
      {/* AVAILABLE ROOMS SECTION */}
      <section></section>
    </div>
  );
};

export default HomePage;
