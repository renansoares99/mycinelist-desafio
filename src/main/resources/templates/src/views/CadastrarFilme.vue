<template>
  <div class="container mt-3">
    <h1>Publique Sobre o Filme</h1>
    <b-form @submit.prevent="saveFilme()">
      <label for="nome">Nome</label>
      <b-form-input
        id="nome"
        v-model="filme.nome"
        type="text"
        placeholder="Doutor Estranho, ..."
        required
        autocomplete="off"
        class="mb-2"
      ></b-form-input>
      <label for="classifique">Classifique</label>
      <b-form-rating
        id="classifique"
        v-model="filme.classifique"
        type="number"
        variant="warning"
        class="mb-2"
      ></b-form-rating>
      <label for="avalie">Avalie</label>
      <b-form-textarea  
        id="avalie"
        v-model="filme.avalie"
        type="text"
        placeholder="O que você acha desse filme?"
        rows="6"
        class="mb-2"
      ></b-form-textarea>

      <b-button type="submit" variant="outline-primary mt-2">Salvar</b-button>
    </b-form>
  </div>
</template>

<script>
import filmeService from '../services/filmeService'

export default {
  name: 'CadastrarFilme',

  data() {
    return {
      filme: {
        nome: "",
        classifique: null,
        avalie: "",
      },
    };
  },

  methods: {
    saveFilme() {
      filmeService.saveFilme(this.filme).then(() => alert('Filme Adicionado Com Sucesso!'))
    }
  },
};
</script>

<style>
</style>