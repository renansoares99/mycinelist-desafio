<template>
  <div class="container mt-4">
    <h1>Filmes Favoritos</h1>
    <!-- Inicio Tabela -->
    <table>
      <thead>
        <!-- Inicio ELemento -->
        <th>Nome</th>
        <th>Minha Classificação</th>
        <th>Minha Avaliação</th>
        <th>Data de Publicação</th>
        <th>Editar/Deletar</th>
        <!-- Fim Elemento -->
      </thead>

      <tbody>
        <tr v-for="filmeService of filme" :key="filmeService.id">
          <!-- Inicio Dados -->
          <td>{{ filmeService.nome }}</td>
          <td>{{ filmeService.classifique }}</td>
          <td>{{ filmeService.avalie }}</td>
          <td>{{ filmeService.data }}</td>
          <td>
            <!-- Inicio Edit -->
            <b-button
              v-b-modal.modal-filme
              variant="outline-info"
              class="mt-2"
            >
              <b-icon icon="pencil-square" aria-hidden="true"></b-icon>
            </b-button>

            <!-- Inicio Item Modal -->
            <b-modal id="modal-filme" title="Editar Série">
              <EditFilmeModal />
            </b-modal>
            <!-- Fim Item Modal --> <!-- Fim Edit -->

            <!-- Inicio Delete -->
            <b-button
              variant="outline-danger"
              class="mt-2"
              onClick="window.location.reload()"
              @click="removerFilme(filmeService.id)"
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
      /* console.log(list.data); */
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
