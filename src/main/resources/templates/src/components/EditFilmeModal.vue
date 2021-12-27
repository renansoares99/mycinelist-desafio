<template>
  <div class="container mt-3">
    <h1>Publique Sobre o Filme</h1>
    <b-form @submit.prevent="saveFilme()">
      <!-- Inicio Input Nome -->
      <label for="nome" class="mt-1">Nome</label>
      <b-form-input
        id="nome"
        v-model="filme.nome"
        type="text"
        placeholder="Doutor Estranho, ..."
        required
        autocomplete="off"
        class="mb-2"
      ></b-form-input>
      <!-- Fim Input Nome -->

      <!-- Inicio Rating -->
      <label for="classifique" class="mt-2">Avalie o filme</label>
      <b-form-rating
        id="classifique"
        v-model="filme.classifique"
        type="number"
        variant="warning"
        class="mb-2"
      ></b-form-rating>
      <!-- Fim Rating -->

      <!-- Inicio Textarea -->
      <label for="avalie" class="mt-2">Adicione um comentário</label>
      <b-form-textarea
        id="avalie"
        v-model="filme.avalie"
        type="text"
        placeholder="O que você achou desse filme?"
        required
        rows="6"
        class="mb-2"
      ></b-form-textarea>
      <!-- Fim Textarea -->

      <!-- Inicio Button -->
      <b-button type="submit" variant="outline-primary mt-2">Salvar</b-button>
      <!-- Fim Button -->
    </b-form>
  </div>
</template>

<script>
/* import filmeService from "../services/filmeService"; */

export default {
  name: "CadastrarFilme",

  data() {
    return {
      filme: {
        nome: "",
        classifique: null,
        avalie: "",
      },
    };
  },

  methods: {},
};
</script>

