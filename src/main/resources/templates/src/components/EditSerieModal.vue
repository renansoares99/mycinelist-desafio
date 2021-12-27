<template>
  <div class="container mt-3">
    <h1>Publique Sobre a Série</h1>
    <b-form>
      <!-- Inicio Input Nome -->
      <label for="nome" class="mt-1">Nome</label>
      <b-form-input
        id="nome"
        v-model="edit.nome"
        type="text"
        placeholder="The Witcher, ..."
        required
        autocomplete="off"
        class="md-2"
      >
      </b-form-input>
      <!-- Fim Input Nome -->

      <!-- Inicio Input Temp. -->
      <label for="temporada" class="mt-2">Em qual temporada você está?</label>
      <b-form-input
        id="temporada"
        v-model="edit.temporada"
        type="text"
        placeholder="Temp. 1, ..."
        required
        autocomplete="off"
        class="md-2"
      >
      </b-form-input>
      <!-- Fim Input Temp. -->

      <!-- Inicio Input Ep. -->
      <label for="episodio" class="mt-2">Em qual episódio você está?</label>
      <b-form-input
        id="episodio"
        v-model="edit.episodio"
        type="text"
        placeholder="Ep. 1, ..."
        required
        autocomplete="off"
        class="md-2"
      >
      </b-form-input>
      <!-- Fim Input Ep -->

      <!-- Inicio Rating -->
      <label for="classifique" class="mt-2">Avalie a série</label>
      <b-form-rating
        id="classifique"
        v-model="edit.classifique"
        type="number"
        variant="warning"
        class="mb-1"
      ></b-form-rating>
      <!-- Fim Rating -->

      <!-- Inicio Textarea -->
      <label for="avalie" class="mt-1">Adicione um comentário</label>
      <b-form-textarea
        id="avalie"
        v-model="edit.avalie"
        type="text"
        placeholder="O que você achou dessa série?"
        required
        rows="6"
        class="mb-2"
      >
      </b-form-textarea>
      <!-- Fim Textarea -->

      <!-- Inicio Button -->
      <b-button type="submit" variant="outline-primary mt-1">Salvar</b-button>
      <!-- Fim Button -->
    </b-form>
  </div>
</template>

<script>
/* import serieService from "../services/serieService"; */

export default {
  nome: "EditSerieModal",

  data() {
    return {
      edit: {
        id: "",
        nome: "",
        temporada: "",
        episodio: "",
        classifique: null,
        avalie: "",
      },
    };
  },

  methods: {},
};
</script>
