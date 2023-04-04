import React from 'react'
import PropTypes from 'prop-types'

const SegundoComponente = ({nombre, apellido, info}) => {
  return (
    <div>
    <h1>SegundoComponente</h1>
    <li>
        {nombre} {}{apellido}
    </li>
        <li>{info.lugar}</li>
        <li>{info.gusto}</li>

    </div>
  )
}

