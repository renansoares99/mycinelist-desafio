<template>
  <div class="container mt-4">
    <h1>Séries Favoritos</h1>
    <table>
      <thead>
        <th>Nome</th>
        <th>Temp. Atual</th>
        <th>Ep. Atual</th>
        <th>Sua Classificação</th>
        <th>Sua Avaliação</th>
        <th>Data de Lançamento</th>
        <th>Editar/Deletar</th>
      </thead>
      <tbody>
        <tr v-for="serieService of serie" :key="serieService.id">
          <td>{{ serieService.nome }}</td>
          <td>{{ serieService.temporada }}</td>
          <td>{{ serieService.episodio }}</td>
          <td>{{ serieService.classifique }}</td>
          <td>{{ serieService.avalie }}</td>
          <td>{{ serieService.data }}</td>
          <td>
            <b-button
              variant="outline-info"
              class="mt-2"
              onClick="window.location.reload()"
              @click="editarSerie(serieService.id)"
            >
              <b-icon icon="pencil-square" aria-hidden="true"></b-icon>
            </b-button>
            <b-button
              variant="outline-danger"
              class="mt-2"
              onClick="window.location.reload()"
              @click="removerSerie(serieService.id)"
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
import serieService from "../services/serieService";

export default {
  nome: "HomeS",

  data() {
    return {
      serie: [],
    };
  },

  mounted() {
    serieService.Listar().then((list) => {
      console.log(list.data);
      this.serie = list.data;
    });
  },

  methods: {
    removerSerie(id) {
      serieService.deleteSerie(id).then(() => {
        this.serie();
      })
    }
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