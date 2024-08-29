const FooterComponent = () => {
  return (
    <footer>
      <span className="my-footer">
        Peghon Hotel | Todos los derechos reservados &copy;
        {new Date().getFullYear()}
      </span>
    </footer>
  );
};

export default FooterComponent;
