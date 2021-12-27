<template>
  <div>
    <b-navbar toggleable type="danger" variant="danger">
      <!-- Inicio Navbar Collapse -->
      <b-navbar-toggle target="navbar-toggle-collapse">
        <template #default="{ expanded }">
          <b-icon
            v-if="expanded"
            icon="chevron-bar-up"
            style="color: #ffffff"
          ></b-icon>

          <b-icon
            v-else
            icon="chevron-bar-down"
            style="color: #ffffff"
          ></b-icon>
        </template>
      </b-navbar-toggle>
      <!-- Fim Navbar Collapse -->

      <b-navbar-brand to="/" class="text-white">MyCineList</b-navbar-brand>

      <!-- Inicio Collapse Item -->
      <b-collapse id="navbar-toggle-collapse" is-nav>
        <b-navbar-brand>
          <!-- Inicio Item Dropdown -->
          <b-nav-item-dropdown
            toggle-class="text-white"
            class="text-decorate-none"
            style="list-style-type: none"
            text="Filme"
          >
            <b-dropdown-item to="/home/filme">Home</b-dropdown-item>
            <b-dropdown-item to="/cadastro/filme">Cadastrar</b-dropdown-item>
          </b-nav-item-dropdown>
          <!-- Fim Item Dropdown -->
        </b-navbar-brand>

        <b-navbar-brand>
          <!-- Inicio Item Dropdown -->
          <b-nav-item-dropdown
            toggle-class="text-white"
            class="text-decorate-none"
            style="list-style-type: none"
            text="Série"
          >
            <b-dropdown-item to="/home/serie">Home</b-dropdown-item>
            <b-dropdown-item to="/cadastro/serie">Cadastrar</b-dropdown-item>
          </b-nav-item-dropdown>
          <!-- Fim Item Dropdown -->
        </b-navbar-brand>
      </b-collapse>
      <!-- Fim Collapse Item -->
    </b-navbar>
    <router-view />
  </div>
</template>
