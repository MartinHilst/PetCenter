<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lista de Pets</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link rel="stylesheet" href="./styles/styles.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body class="bg-green">

    <section>
        <div class="superior d-flex justify-content-between mt-3 gap-3 me-0">
            <div class=" col sup-esq w-50 ms-4">
                <h1 class="text-yonky">Clientes: </h1>
            </div>
            <div class="col row justify-content-end m-0">
                <div class="sup-dir w-50">
                    <a href="/CP_05/CadastroPetServlet"><img src="./resources/img/foto-pet-default-2.png" alt="Adicionar Pet"
                            class="img-fluid w-25"></a>
                    <a href="/CP_05/ListaTutores"><img src="./resources/img/btn-user.png" alt="Lista de Tutores" class="img-fluid w-25"></a>
                </div>
            </div>

        </div>

        <div class="inferior mt-5 d-flex justify-content-center mx-5 text-varche">
            <div class="card w-100">
                <table class="table w-100">
                    <thead class="text-yonky">
                      <tr>
                        <th scope="col">Nome</th>
                        <th scope="col">Raça</th>
                        <th scope="col">Cor</th>
                        <th scope="col">Idade</th>
                        <th scope="col"></th>
                      </tr>
                    </thead>
                    <tbody>
                      <c:forEach items="${animais}" var="animal">
						<tr>
                        <td><a href="/CP_05/PerfilPet?id=${animal.idAnimal}">${animal.nome}</a></td>
                        <td>${animal.raca}</td>
                        <td>${animal.cor}</td>
                        <td>${animal.idade}</td>
                        <td><a href="/CP_05/RemoverPet?id=${animal.idAnimal}">Remover</a></td>
                      </tr>
                    </c:forEach>
                    </tbody>
                  </table>
            </div>

            
        </div>
        <div class="row align-items-end justify-content-end w-100">
            <a class="d-flex col justify-content-end" href="menu.jsp"><i class="text-black ms-3 mt-4 bi bi-box-arrow-right fs-1"></i></a>
        </div>
    </section>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
    </script>
</body>

</html>