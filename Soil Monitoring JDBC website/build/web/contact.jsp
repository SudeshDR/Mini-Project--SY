<%-- 
    Document   : index
    Created on : 14 Feb, 2023, 12:11:28 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
      integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <link rel="stylesheet" href="style.css">
    <title>Soil Monitoring System || Contact Page</title>
  </head>
  <body>
    <header>
      <div class="main-nav">
        <a href="index.html" class="logo">Soil Monitoring System.</a>

        <ul>
          <li><a href="index.jsp">home</a></li>
          <li><a href="Features.jsp">Features</a></li>
          <li><a href="contact.jsp">contact</a></li>
        </ul>
      </div>

      <div class="sub-nav">
        <ul>
          <li>
            <a href="https://www.linkedin.com/in/omkar-shinde-904564261/"><i class="fab fa-facebook-f"></i></a>
          </li>
          <li>
            <a href="https://www.linkedin.com/in/sudesh-rajbhar-a37015261/">
              <i class="fab fa-twitter"></i>
            </a>
          </li>
          <li>
            <a href="https://www.linkedin.com/in/shivam-prajapati-090836262/">
              <i class="fab fa-instagram-square"></i>
            </a>
          </li>
        </ul>
      </div>
    </header>

    <div class="container">
      <div class="description">
        <h2 class="heading-secondary">
          Contact us
        </h2>
        <p>
          Contact us on our Social Websites and you can also call us on the following number if you have any Queries related to our device </p>
        <p>SUDESH: 9969145000</p>
        <p>SHIVAM: 1234567890</p>
        <p>OMKAR: 7045361590</p>
      </div>

      <div class="contact-form mb">
        <form action="servlet" method="post">
          <div class="row">
            <div class="input50">
              <input type="text" placeholder="FirstName" name="FirstName">
            </div>
            <div class="input50">
              <input type="text" placeholder="LastName" name="LastName">
            </div>
          </div>

          <div class="row">
            <div class="input50">
              <input type="email" placeholder="Email" name="Email">
            </div>
            <div class="input50">
              <input type="text" placeholder="Subject" name="Subject">
            </div>
          </div>

          <div class="row">
            <div class="input100">
              <textarea placeholder="Message" name="Message"></textarea>
            </div>
          </div>

          <div class="row">
            <div class="input100">
              <input type="submit" value="Send" ></input>
            </div>
          </div>
        </form>
      </div>

    </div>
  </body>
</html>

