<template>
  <div class="container mt-4">
    <h1>Séries Favoritas</h1>
    <!-- Inicio Tabela -->
    <table>
      <thead>
        <!-- Inicio ELemento -->
        <th>Nome</th>
        <th>Temp. Atual</th>
        <th>Ep. Atual</th>
        <th>Minha Classificação</th>
        <th>Minha Avaliação</th>
        <th>Data de Publicação</th>
        <th>Editar/Deletar</th>
        <!-- Fim Elemento -->
      </thead>

      <tbody>
        <tr v-for="serieService of serie" :key="serieService.id">
          <!-- Inicio Dados -->
          <td>{{ serieService.nome }}</td>
          <td>{{ serieService.temporada }}</td>
          <td>{{ serieService.episodio }}</td>
          <td>{{ serieService.classifique }}</td>
          <td>{{ serieService.avalie }}</td>
          <td>{{ serieService.data }}</td>
          <td>
            <!-- Inicio Edit -->
            <b-button
              v-b-modal.modal-serie
              variant="outline-info"
              class="mt-2"
              @click="editar(serieService)"
            >
              <b-icon icon="pencil-square" aria-hidden="true"></b-icon>
            </b-button>

            <!-- Inicio Item Modal -->
            <b-modal id="modal-serie" title="Editar">
              <EditSerieModal />
            </b-modal>
            <!-- Fim Item Modal --> <!-- Fim Edit -->

            <!-- Inicio Delete -->
            <b-button
              variant="outline-danger"
              class="mt-2"
              onClick="window.location.reload()"
              @click="removerSerie(serieService.id)"
            >
              <b-icon icon="trash" aria-hidden="true"></b-icon>
            </b-button>
            <!-- Fim Delete -->
          </td>
          <!-- Fim Dados -->
        </tr>
      </tbody>
    </table>
    <!-- Fim Tabela -->
  </div>
</template>

<script>
import serieService from "../services/serieService";
import EditSerieModal from "../components/EditSerieModal.vue";

export default {
  nome: "HomeS",
  components: { EditSerieModal },

  data() {
    return {
      serie: [],
    };
  },

  mounted() {
    serieService.Listar().then((list) => {
      /* console.log(list.data); */
      this.serie = list.data;
    });
  },

  methods: {
    editar(serie) {
      this.serieService = serie;
    },

    removerSerie(id) {
      serieService.deleteSerie(id).then(() => {
        this.serie();
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