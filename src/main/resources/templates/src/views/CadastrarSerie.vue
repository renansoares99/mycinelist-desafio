<template>
  <div class="container mt-3">
    <h1>Publique Sobre o Filme</h1>
    <b-form @submit.prevent="saveSerie()">
      <!-- Inicio Input Nome -->
      <label for="nome" class="mt-1">Nome</label>
      <b-form-input
        id="nome"
        v-model="serie.nome"
        type="text"
        placeholder="The Witcher, ..."
        required
        autocomplete="off"
        class="md-2"
      >
      </b-form-input>
      <!-- Fim Input Nome -->

      <!-- Inicio Input Temp. -->
      <label for="temporada" class="mt-2">Qual Temporada Você Está?</label>
      <b-form-input
        id="temporada"
        v-model="serie.temporada"
        type="text"
        placeholder="Temp. 1, ..."
        required
        autocomplete="off"
        class="md-2"
      >
      </b-form-input>
      <!-- Fim Input Temp. -->

      <!-- Inicio Input Ep. -->
      <label for="episodio" class="mt-2">Qual Episódio Você Está?</label>
      <b-form-input
        id="episodio"
        v-model="serie.episodio"
        type="text"
        placeholder="Ep. 1, ..."
        required
        autocomplete="off"
        class="md-2"
      >
      </b-form-input>
      <!-- Fim Input Ep -->

      <!-- Inicio Rating -->
      <label for="classifique" class="mt-2">O Quanto Você Gostou da Série?</label>
      <b-form-rating
        id="classifique"
        v-model="serie.classifique"
        type="number"
        variant="warning"
        class="mb-1"
      ></b-form-rating>
      <!-- Fim Rating -->

      <!-- Inicio Textarea -->
      <label for="avalie" class="mt-1">Avalie a Série?</label>
      <b-form-textarea
        id="avalie"
        v-model="serie.avalie"
        type="text"
        placeholder="O que você achou dessa série?"
        required
        rows="6"
        class="mb-2"
      >
      </b-form-textarea>
      <!-- Fim Textarea -->

      <!-- Inicio Button -->
      <b-button type="submit" variant="outline-primary mt-2">Salvar</b-button>
      <!-- Fim Button -->
    </b-form>
  </div>
</template>

<script>
import serieService from "../services/serieService";

export default {
  nome: "CadastrarSerie",

  data() {
    return {
      serie: {
        nome: "",
        temporada: "",
        episodio: "",
        classifique: null,
        avalie: "",
      },
    };
  },

  methods: {
    saveSerie() {
      serieService
        .saveSerie(this.serie)
        .then(() => alert("Série Adicionada Com Sucesso!"));
    },
  },
};
</script>

<style>
</style>