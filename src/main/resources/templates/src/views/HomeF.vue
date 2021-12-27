<template>
  <div class="container mt-4">
    <h1>Filmes Favoritos</h1>
    <table>
      <thead>
        <th>Nome</th>
        <th>Sue Classificação</th>
        <th>Sua Avaliação</th>
        <th>Data de Lançamento</th>
        <th>Editar/Deletar</th>
      </thead>
      <tbody>
        <tr v-for="filmeService of filme" :key="filmeService.id">
          <td>{{ filmeService.nome }}</td>
          <td>{{ filmeService.classifique }}</td>
          <td>{{ filmeService.avalie }}</td>
          <td>{{ filmeService.data }}</td>
          <td>
            <b-button
              variant="outline-info"
              class="mt-2"
              onClick="window.location.reload()"
              @click="editarFilme(filmeService.id)"
            >
              <b-icon icon="pencil-square" aria-hidden="true"></b-icon>
            </b-button>
            <b-button
              variant="outline-danger"
              class="mt-2"
              onClick="window.location.reload()"
              @click="removerFilme(filmeService.id)"
            >
              <b-icon icon="trash" aria-hidden="true"></b-icon>
            </b-button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import filmeService from "../services/filmeService";

export default {
  name: "HomeF",

  data() {
    return {
      filme: [],
    };
  },

  mounted() {
    filmeService.listar().then((list) => {
      console.log(list.data);
      this.filme = list.data;
    });
  },

  methods: {
    removerFilme(id) {
      filmeService.deleteFilme(id).then(() => {
        this.filme();
      });
    },
  },
};
</script>

<style>
table {
  width: 100%;
  text-align: center;
}

th,
td {
  padding: 5px;
  border: 2px solid #a1a1a1;
}

h1 {
  padding: 6px 2px 1px 0px;
}

.container {
  padding-bottom: 20px;
  height: 100%;
  background-color: #f2f2f2;
}
</style>
