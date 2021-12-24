<template>
  <div>
    <b-navbar toggleable type="danger" variant="danger">
      <b-navbar-toggle target="navbar-toggle-collapse">
        <template #default="{ expanded }">
          <b-icon v-if="expanded" icon="chevron-bar-up" style="color: #000000;"></b-icon>
          <b-icon v-else icon="chevron-bar-down" style="color: #000000;"></b-icon>
        </template>
      </b-navbar-toggle>

      <b-navbar-brand to="/" class="text-white">MyCineList</b-navbar-brand>

      <b-collapse id="navbar-toggle-collapse" is-nav>
        <b-navbar-brand to="/" class="text-white">Home</b-navbar-brand>
        <b-navbar-brand to="/cadastro" class="text-white">Cadastrar Filme</b-navbar-brand>
      </b-collapse>
    </b-navbar>
    <router-view />
  </div>
</template>

<style>
</style>
