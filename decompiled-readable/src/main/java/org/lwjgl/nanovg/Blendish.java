/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.BNDnodeTheme;
import org.lwjgl.nanovg.BNDtheme;
import org.lwjgl.nanovg.BNDwidgetTheme;
import org.lwjgl.nanovg.LibNanoVG;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class Blendish {
    public static final float BND_DISABLED_ALPHA = 0.5f;
    public static final int BND_LEFT = 0;
    public static final int BND_CENTER = 1;
    public static final int BND_DEFAULT = 0;
    public static final int BND_HOVER = 1;
    public static final int BND_ACTIVE = 2;
    public static final int BND_CORNER_NONE = 0;
    public static final int BND_CORNER_TOP_LEFT = 1;
    public static final int BND_CORNER_TOP_RIGHT = 2;
    public static final int BND_CORNER_DOWN_RIGHT = 4;
    public static final int BND_CORNER_DOWN_LEFT = 8;
    public static final int BND_CORNER_ALL = 15;
    public static final int BND_CORNER_TOP = 3;
    public static final int BND_CORNER_DOWN = 12;
    public static final int BND_CORNER_LEFT = 9;
    public static final int BND_CORNER_RIGHT = 6;
    public static final int BND_WIDGET_HEIGHT = 21;
    public static final int BND_TOOL_WIDTH = 20;
    public static final int BND_NODE_PORT_RADIUS = 5;
    public static final int BND_NODE_MARGIN_TOP = 25;
    public static final int BND_NODE_MARGIN_DOWN = 5;
    public static final int BND_NODE_MARGIN_SIDE = 10;
    public static final int BND_NODE_TITLE_HEIGHT = 20;
    public static final int BND_NODE_ARROW_AREA_WIDTH = 20;
    public static final int BND_SPLITTER_AREA_SIZE = 12;
    public static final int BND_SCROLLBAR_WIDTH = 13;
    public static final int BND_SCROLLBAR_HEIGHT = 14;
    public static final int BND_VSPACING = 1;
    public static final int BND_VSPACING_GROUP = 8;
    public static final int BND_HSPACING = 8;
    public static final int BND_ICON_NONE;
    public static final int BND_ICON_QUESTION;
    public static final int BND_ICON_ERROR;
    public static final int BND_ICON_CANCEL;
    public static final int BND_ICON_TRIA_RIGHT;
    public static final int BND_ICON_TRIA_DOWN;
    public static final int BND_ICON_TRIA_LEFT;
    public static final int BND_ICON_TRIA_UP;
    public static final int BND_ICON_ARROW_LEFTRIGHT;
    public static final int BND_ICON_PLUS;
    public static final int BND_ICON_DISCLOSURE_TRI_DOWN;
    public static final int BND_ICON_DISCLOSURE_TRI_RIGHT;
    public static final int BND_ICON_RADIOBUT_OFF;
    public static final int BND_ICON_RADIOBUT_ON;
    public static final int BND_ICON_MENU_PANEL;
    public static final int BND_ICON_BLENDER;
    public static final int BND_ICON_GRIP;
    public static final int BND_ICON_DOT;
    public static final int BND_ICON_COLLAPSEMENU;
    public static final int BND_ICON_X;
    public static final int BND_ICON_GO_LEFT;
    public static final int BND_ICON_PLUG;
    public static final int BND_ICON_UI;
    public static final int BND_ICON_NODE;
    public static final int BND_ICON_NODE_SEL;
    public static final int BND_ICON_FULLSCREEN;
    public static final int BND_ICON_SPLITSCREEN;
    public static final int BND_ICON_RIGHTARROW_THIN;
    public static final int BND_ICON_BORDERMOVE;
    public static final int BND_ICON_VIEWZOOM;
    public static final int BND_ICON_ZOOMIN;
    public static final int BND_ICON_ZOOMOUT;
    public static final int BND_ICON_PANEL_CLOSE;
    public static final int BND_ICON_COPY_ID;
    public static final int BND_ICON_EYEDROPPER;
    public static final int BND_ICON_LINK_AREA;
    public static final int BND_ICON_AUTO;
    public static final int BND_ICON_CHECKBOX_DEHLT;
    public static final int BND_ICON_CHECKBOX_HLT;
    public static final int BND_ICON_UNLOCKED;
    public static final int BND_ICON_LOCKED;
    public static final int BND_ICON_UNPINNED;
    public static final int BND_ICON_PINNED;
    public static final int BND_ICON_SCREEN_BACK;
    public static final int BND_ICON_RIGHTARROW;
    public static final int BND_ICON_DOWNARROW_HLT;
    public static final int BND_ICON_DOTSUP;
    public static final int BND_ICON_DOTSDOWN;
    public static final int BND_ICON_LINK;
    public static final int BND_ICON_INLINK;
    public static final int BND_ICON_PLUGIN;
    public static final int BND_ICON_HELP;
    public static final int BND_ICON_GHOST_ENABLED;
    public static final int BND_ICON_COLOR;
    public static final int BND_ICON_LINKED;
    public static final int BND_ICON_UNLINKED;
    public static final int BND_ICON_HAND;
    public static final int BND_ICON_ZOOM_ALL;
    public static final int BND_ICON_ZOOM_SELECTED;
    public static final int BND_ICON_ZOOM_PREVIOUS;
    public static final int BND_ICON_ZOOM_IN;
    public static final int BND_ICON_ZOOM_OUT;
    public static final int BND_ICON_RENDER_REGION;
    public static final int BND_ICON_BORDER_RECT;
    public static final int BND_ICON_BORDER_LASSO;
    public static final int BND_ICON_FREEZE;
    public static final int BND_ICON_STYLUS_PRESSURE;
    public static final int BND_ICON_GHOST_DISABLED;
    public static final int BND_ICON_NEW;
    public static final int BND_ICON_FILE_TICK;
    public static final int BND_ICON_QUIT;
    public static final int BND_ICON_URL;
    public static final int BND_ICON_RECOVER_LAST;
    public static final int BND_ICON_FULLSCREEN_ENTER;
    public static final int BND_ICON_FULLSCREEN_EXIT;
    public static final int BND_ICON_BLANK1;
    public static final int BND_ICON_LAMP;
    public static final int BND_ICON_MATERIAL;
    public static final int BND_ICON_TEXTURE;
    public static final int BND_ICON_ANIM;
    public static final int BND_ICON_WORLD;
    public static final int BND_ICON_SCENE;
    public static final int BND_ICON_EDIT;
    public static final int BND_ICON_GAME;
    public static final int BND_ICON_RADIO;
    public static final int BND_ICON_SCRIPT;
    public static final int BND_ICON_PARTICLES;
    public static final int BND_ICON_PHYSICS;
    public static final int BND_ICON_SPEAKER;
    public static final int BND_ICON_TEXTURE_SHADED;
    public static final int BND_ICON_VIEW3D;
    public static final int BND_ICON_IPO;
    public static final int BND_ICON_OOPS;
    public static final int BND_ICON_BUTS;
    public static final int BND_ICON_FILESEL;
    public static final int BND_ICON_IMAGE_COL;
    public static final int BND_ICON_INFO;
    public static final int BND_ICON_SEQUENCE;
    public static final int BND_ICON_TEXT;
    public static final int BND_ICON_IMASEL;
    public static final int BND_ICON_SOUND;
    public static final int BND_ICON_ACTION;
    public static final int BND_ICON_NLA;
    public static final int BND_ICON_SCRIPTWIN;
    public static final int BND_ICON_TIME;
    public static final int BND_ICON_NODETREE;
    public static final int BND_ICON_LOGIC;
    public static final int BND_ICON_CONSOLE;
    public static final int BND_ICON_PREFERENCES;
    public static final int BND_ICON_CLIP;
    public static final int BND_ICON_ASSET_MANAGER;
    public static final int BND_ICON_OBJECT_DATAMODE;
    public static final int BND_ICON_EDITMODE_HLT;
    public static final int BND_ICON_FACESEL_HLT;
    public static final int BND_ICON_VPAINT_HLT;
    public static final int BND_ICON_TPAINT_HLT;
    public static final int BND_ICON_WPAINT_HLT;
    public static final int BND_ICON_SCULPTMODE_HLT;
    public static final int BND_ICON_POSE_HLT;
    public static final int BND_ICON_PARTICLEMODE;
    public static final int BND_ICON_LIGHTPAINT;
    public static final int BND_ICON_SCENE_DATA;
    public static final int BND_ICON_RENDERLAYERS;
    public static final int BND_ICON_WORLD_DATA;
    public static final int BND_ICON_OBJECT_DATA;
    public static final int BND_ICON_MESH_DATA;
    public static final int BND_ICON_CURVE_DATA;
    public static final int BND_ICON_META_DATA;
    public static final int BND_ICON_LATTICE_DATA;
    public static final int BND_ICON_LAMP_DATA;
    public static final int BND_ICON_MATERIAL_DATA;
    public static final int BND_ICON_TEXTURE_DATA;
    public static final int BND_ICON_ANIM_DATA;
    public static final int BND_ICON_CAMERA_DATA;
    public static final int BND_ICON_PARTICLE_DATA;
    public static final int BND_ICON_LIBRARY_DATA_DIRECT;
    public static final int BND_ICON_GROUP;
    public static final int BND_ICON_ARMATURE_DATA;
    public static final int BND_ICON_POSE_DATA;
    public static final int BND_ICON_BONE_DATA;
    public static final int BND_ICON_CONSTRAINT;
    public static final int BND_ICON_SHAPEKEY_DATA;
    public static final int BND_ICON_CONSTRAINT_BONE;
    public static final int BND_ICON_CAMERA_STEREO;
    public static final int BND_ICON_PACKAGE;
    public static final int BND_ICON_UGLYPACKAGE;
    public static final int BND_ICON_BRUSH_DATA;
    public static final int BND_ICON_IMAGE_DATA;
    public static final int BND_ICON_FILE;
    public static final int BND_ICON_FCURVE;
    public static final int BND_ICON_FONT_DATA;
    public static final int BND_ICON_RENDER_RESULT;
    public static final int BND_ICON_SURFACE_DATA;
    public static final int BND_ICON_EMPTY_DATA;
    public static final int BND_ICON_SETTINGS;
    public static final int BND_ICON_RENDER_ANIMATION;
    public static final int BND_ICON_RENDER_STILL;
    public static final int BND_ICON_BOIDS;
    public static final int BND_ICON_STRANDS;
    public static final int BND_ICON_LIBRARY_DATA_INDIRECT;
    public static final int BND_ICON_GREASEPENCIL;
    public static final int BND_ICON_LINE_DATA;
    public static final int BND_ICON_GROUP_BONE;
    public static final int BND_ICON_GROUP_VERTEX;
    public static final int BND_ICON_GROUP_VCOL;
    public static final int BND_ICON_GROUP_UVS;
    public static final int BND_ICON_RNA;
    public static final int BND_ICON_RNA_ADD;
    public static final int BND_ICON_OUTLINER_OB_EMPTY;
    public static final int BND_ICON_OUTLINER_OB_MESH;
    public static final int BND_ICON_OUTLINER_OB_CURVE;
    public static final int BND_ICON_OUTLINER_OB_LATTICE;
    public static final int BND_ICON_OUTLINER_OB_META;
    public static final int BND_ICON_OUTLINER_OB_LAMP;
    public static final int BND_ICON_OUTLINER_OB_CAMERA;
    public static final int BND_ICON_OUTLINER_OB_ARMATURE;
    public static final int BND_ICON_OUTLINER_OB_FONT;
    public static final int BND_ICON_OUTLINER_OB_SURFACE;
    public static final int BND_ICON_OUTLINER_OB_SPEAKER;
    public static final int BND_ICON_RESTRICT_VIEW_OFF;
    public static final int BND_ICON_RESTRICT_VIEW_ON;
    public static final int BND_ICON_RESTRICT_SELECT_OFF;
    public static final int BND_ICON_RESTRICT_SELECT_ON;
    public static final int BND_ICON_RESTRICT_RENDER_OFF;
    public static final int BND_ICON_RESTRICT_RENDER_ON;
    public static final int BND_ICON_OUTLINER_DATA_EMPTY;
    public static final int BND_ICON_OUTLINER_DATA_MESH;
    public static final int BND_ICON_OUTLINER_DATA_CURVE;
    public static final int BND_ICON_OUTLINER_DATA_LATTICE;
    public static final int BND_ICON_OUTLINER_DATA_META;
    public static final int BND_ICON_OUTLINER_DATA_LAMP;
    public static final int BND_ICON_OUTLINER_DATA_CAMERA;
    public static final int BND_ICON_OUTLINER_DATA_ARMATURE;
    public static final int BND_ICON_OUTLINER_DATA_FONT;
    public static final int BND_ICON_OUTLINER_DATA_SURFACE;
    public static final int BND_ICON_OUTLINER_DATA_SPEAKER;
    public static final int BND_ICON_OUTLINER_DATA_POSE;
    public static final int BND_ICON_MESH_PLANE;
    public static final int BND_ICON_MESH_CUBE;
    public static final int BND_ICON_MESH_CIRCLE;
    public static final int BND_ICON_MESH_UVSPHERE;
    public static final int BND_ICON_MESH_ICOSPHERE;
    public static final int BND_ICON_MESH_GRID;
    public static final int BND_ICON_MESH_MONKEY;
    public static final int BND_ICON_MESH_CYLINDER;
    public static final int BND_ICON_MESH_TORUS;
    public static final int BND_ICON_MESH_CONE;
    public static final int BND_ICON_LAMP_POINT;
    public static final int BND_ICON_LAMP_SUN;
    public static final int BND_ICON_LAMP_SPOT;
    public static final int BND_ICON_LAMP_HEMI;
    public static final int BND_ICON_LAMP_AREA;
    public static final int BND_ICON_META_EMPTY;
    public static final int BND_ICON_META_PLANE;
    public static final int BND_ICON_META_CUBE;
    public static final int BND_ICON_META_BALL;
    public static final int BND_ICON_META_ELLIPSOID;
    public static final int BND_ICON_META_CAPSULE;
    public static final int BND_ICON_SURFACE_NCURVE;
    public static final int BND_ICON_SURFACE_NCIRCLE;
    public static final int BND_ICON_SURFACE_NSURFACE;
    public static final int BND_ICON_SURFACE_NCYLINDER;
    public static final int BND_ICON_SURFACE_NSPHERE;
    public static final int BND_ICON_SURFACE_NTORUS;
    public static final int BND_ICON_CURVE_BEZCURVE;
    public static final int BND_ICON_CURVE_BEZCIRCLE;
    public static final int BND_ICON_CURVE_NCURVE;
    public static final int BND_ICON_CURVE_NCIRCLE;
    public static final int BND_ICON_CURVE_PATH;
    public static final int BND_ICON_COLOR_RED;
    public static final int BND_ICON_COLOR_GREEN;
    public static final int BND_ICON_COLOR_BLUE;
    public static final int BND_ICON_FORCE_FORCE;
    public static final int BND_ICON_FORCE_WIND;
    public static final int BND_ICON_FORCE_VORTEX;
    public static final int BND_ICON_FORCE_MAGNETIC;
    public static final int BND_ICON_FORCE_HARMONIC;
    public static final int BND_ICON_FORCE_CHARGE;
    public static final int BND_ICON_FORCE_LENNARDJONES;
    public static final int BND_ICON_FORCE_TEXTURE;
    public static final int BND_ICON_FORCE_CURVE;
    public static final int BND_ICON_FORCE_BOID;
    public static final int BND_ICON_FORCE_TURBULENCE;
    public static final int BND_ICON_FORCE_DRAG;
    public static final int BND_ICON_FORCE_SMOKEFLOW;
    public static final int BND_ICON_MODIFIER;
    public static final int BND_ICON_MOD_WAVE;
    public static final int BND_ICON_MOD_BUILD;
    public static final int BND_ICON_MOD_DECIM;
    public static final int BND_ICON_MOD_MIRROR;
    public static final int BND_ICON_MOD_SOFT;
    public static final int BND_ICON_MOD_SUBSURF;
    public static final int BND_ICON_HOOK;
    public static final int BND_ICON_MOD_PHYSICS;
    public static final int BND_ICON_MOD_PARTICLES;
    public static final int BND_ICON_MOD_BOOLEAN;
    public static final int BND_ICON_MOD_EDGESPLIT;
    public static final int BND_ICON_MOD_ARRAY;
    public static final int BND_ICON_MOD_UVPROJECT;
    public static final int BND_ICON_MOD_DISPLACE;
    public static final int BND_ICON_MOD_CURVE;
    public static final int BND_ICON_MOD_LATTICE;
    public static final int BND_ICON_CONSTRAINT_DATA;
    public static final int BND_ICON_MOD_ARMATURE;
    public static final int BND_ICON_MOD_SHRINKWRAP;
    public static final int BND_ICON_MOD_CAST;
    public static final int BND_ICON_MOD_MESHDEFORM;
    public static final int BND_ICON_MOD_BEVEL;
    public static final int BND_ICON_MOD_SMOOTH;
    public static final int BND_ICON_MOD_SIMPLEDEFORM;
    public static final int BND_ICON_MOD_MASK;
    public static final int BND_ICON_MOD_CLOTH;
    public static final int BND_ICON_MOD_EXPLODE;
    public static final int BND_ICON_MOD_FLUIDSIM;
    public static final int BND_ICON_MOD_MULTIRES;
    public static final int BND_ICON_MOD_SMOKE;
    public static final int BND_ICON_MOD_SOLIDIFY;
    public static final int BND_ICON_MOD_SCREW;
    public static final int BND_ICON_MOD_VERTEX_WEIGHT;
    public static final int BND_ICON_MOD_DYNAMICPAINT;
    public static final int BND_ICON_MOD_REMESH;
    public static final int BND_ICON_MOD_OCEAN;
    public static final int BND_ICON_MOD_WARP;
    public static final int BND_ICON_MOD_SKIN;
    public static final int BND_ICON_MOD_TRIANGULATE;
    public static final int BND_ICON_MOD_WIREFRAME;
    public static final int BND_ICON_REC;
    public static final int BND_ICON_PLAY;
    public static final int BND_ICON_FF;
    public static final int BND_ICON_REW;
    public static final int BND_ICON_PAUSE;
    public static final int BND_ICON_PREV_KEYFRAME;
    public static final int BND_ICON_NEXT_KEYFRAME;
    public static final int BND_ICON_PLAY_AUDIO;
    public static final int BND_ICON_PLAY_REVERSE;
    public static final int BND_ICON_PREVIEW_RANGE;
    public static final int BND_ICON_ACTION_TWEAK;
    public static final int BND_ICON_PMARKER_ACT;
    public static final int BND_ICON_PMARKER_SEL;
    public static final int BND_ICON_PMARKER;
    public static final int BND_ICON_MARKER_HLT;
    public static final int BND_ICON_MARKER;
    public static final int BND_ICON_SPACE2;
    public static final int BND_ICON_SPACE3;
    public static final int BND_ICON_KEYINGSET;
    public static final int BND_ICON_KEY_DEHLT;
    public static final int BND_ICON_KEY_HLT;
    public static final int BND_ICON_MUTE_IPO_OFF;
    public static final int BND_ICON_MUTE_IPO_ON;
    public static final int BND_ICON_VISIBLE_IPO_OFF;
    public static final int BND_ICON_VISIBLE_IPO_ON;
    public static final int BND_ICON_DRIVER;
    public static final int BND_ICON_SOLO_OFF;
    public static final int BND_ICON_SOLO_ON;
    public static final int BND_ICON_FRAME_PREV;
    public static final int BND_ICON_FRAME_NEXT;
    public static final int BND_ICON_NLA_PUSHDOWN;
    public static final int BND_ICON_IPO_CONSTANT;
    public static final int BND_ICON_IPO_LINEAR;
    public static final int BND_ICON_IPO_BEZIER;
    public static final int BND_ICON_IPO_SINE;
    public static final int BND_ICON_IPO_QUAD;
    public static final int BND_ICON_IPO_CUBIC;
    public static final int BND_ICON_IPO_QUART;
    public static final int BND_ICON_IPO_QUINT;
    public static final int BND_ICON_IPO_EXPO;
    public static final int BND_ICON_IPO_CIRC;
    public static final int BND_ICON_IPO_BOUNCE;
    public static final int BND_ICON_IPO_ELASTIC;
    public static final int BND_ICON_IPO_BACK;
    public static final int BND_ICON_IPO_EASE_IN;
    public static final int BND_ICON_IPO_EASE_OUT;
    public static final int BND_ICON_IPO_EASE_IN_OUT;
    public static final int BND_ICON_VERTEXSEL;
    public static final int BND_ICON_EDGESEL;
    public static final int BND_ICON_FACESEL;
    public static final int BND_ICON_LOOPSEL;
    public static final int BND_ICON_ROTATE;
    public static final int BND_ICON_CURSOR;
    public static final int BND_ICON_ROTATECOLLECTION;
    public static final int BND_ICON_ROTATECENTER;
    public static final int BND_ICON_ROTACTIVE;
    public static final int BND_ICON_ALIGN;
    public static final int BND_ICON_SMOOTHCURVE;
    public static final int BND_ICON_SPHERECURVE;
    public static final int BND_ICON_ROOTCURVE;
    public static final int BND_ICON_SHARPCURVE;
    public static final int BND_ICON_LINCURVE;
    public static final int BND_ICON_NOCURVE;
    public static final int BND_ICON_RNDCURVE;
    public static final int BND_ICON_PROP_OFF;
    public static final int BND_ICON_PROP_ON;
    public static final int BND_ICON_PROP_CON;
    public static final int BND_ICON_SCULPT_DYNTOPO;
    public static final int BND_ICON_PARTICLE_POINT;
    public static final int BND_ICON_PARTICLE_TIP;
    public static final int BND_ICON_PARTICLE_PATH;
    public static final int BND_ICON_MAN_TRANS;
    public static final int BND_ICON_MAN_ROT;
    public static final int BND_ICON_MAN_SCALE;
    public static final int BND_ICON_MANIPUL;
    public static final int BND_ICON_SNAP_OFF;
    public static final int BND_ICON_SNAP_ON;
    public static final int BND_ICON_SNAP_NORMAL;
    public static final int BND_ICON_SNAP_INCREMENT;
    public static final int BND_ICON_SNAP_VERTEX;
    public static final int BND_ICON_SNAP_EDGE;
    public static final int BND_ICON_SNAP_FACE;
    public static final int BND_ICON_SNAP_VOLUME;
    public static final int BND_ICON_STICKY_UVS_LOC;
    public static final int BND_ICON_STICKY_UVS_DISABLE;
    public static final int BND_ICON_STICKY_UVS_VERT;
    public static final int BND_ICON_CLIPUV_DEHLT;
    public static final int BND_ICON_CLIPUV_HLT;
    public static final int BND_ICON_SNAP_PEEL_OBJECT;
    public static final int BND_ICON_GRID;
    public static final int BND_ICON_PASTEDOWN;
    public static final int BND_ICON_COPYDOWN;
    public static final int BND_ICON_PASTEFLIPUP;
    public static final int BND_ICON_PASTEFLIPDOWN;
    public static final int BND_ICON_SNAP_SURFACE;
    public static final int BND_ICON_AUTOMERGE_ON;
    public static final int BND_ICON_AUTOMERGE_OFF;
    public static final int BND_ICON_RETOPO;
    public static final int BND_ICON_UV_VERTEXSEL;
    public static final int BND_ICON_UV_EDGESEL;
    public static final int BND_ICON_UV_FACESEL;
    public static final int BND_ICON_UV_ISLANDSEL;
    public static final int BND_ICON_UV_SYNC_SELECT;
    public static final int BND_ICON_BBOX;
    public static final int BND_ICON_WIRE;
    public static final int BND_ICON_SOLID;
    public static final int BND_ICON_SMOOTH;
    public static final int BND_ICON_POTATO;
    public static final int BND_ICON_ORTHO;
    public static final int BND_ICON_LOCKVIEW_OFF;
    public static final int BND_ICON_LOCKVIEW_ON;
    public static final int BND_ICON_AXIS_SIDE;
    public static final int BND_ICON_AXIS_FRONT;
    public static final int BND_ICON_AXIS_TOP;
    public static final int BND_ICON_NDOF_DOM;
    public static final int BND_ICON_NDOF_TURN;
    public static final int BND_ICON_NDOF_FLY;
    public static final int BND_ICON_NDOF_TRANS;
    public static final int BND_ICON_LAYER_USED;
    public static final int BND_ICON_LAYER_ACTIVE;
    public static final int BND_ICON_SORTALPHA;
    public static final int BND_ICON_SORTBYEXT;
    public static final int BND_ICON_SORTTIME;
    public static final int BND_ICON_SORTSIZE;
    public static final int BND_ICON_LONGDISPLAY;
    public static final int BND_ICON_SHORTDISPLAY;
    public static final int BND_ICON_GHOST;
    public static final int BND_ICON_IMGDISPLAY;
    public static final int BND_ICON_SAVE_AS;
    public static final int BND_ICON_SAVE_COPY;
    public static final int BND_ICON_BOOKMARKS;
    public static final int BND_ICON_FONTPREVIEW;
    public static final int BND_ICON_FILTER;
    public static final int BND_ICON_NEWFOLDER;
    public static final int BND_ICON_OPEN_RECENT;
    public static final int BND_ICON_FILE_PARENT;
    public static final int BND_ICON_FILE_REFRESH;
    public static final int BND_ICON_FILE_FOLDER;
    public static final int BND_ICON_FILE_BLANK;
    public static final int BND_ICON_FILE_BLEND;
    public static final int BND_ICON_FILE_IMAGE;
    public static final int BND_ICON_FILE_MOVIE;
    public static final int BND_ICON_FILE_SCRIPT;
    public static final int BND_ICON_FILE_SOUND;
    public static final int BND_ICON_FILE_FONT;
    public static final int BND_ICON_FILE_TEXT;
    public static final int BND_ICON_RECOVER_AUTO;
    public static final int BND_ICON_SAVE_PREFS;
    public static final int BND_ICON_LINK_BLEND;
    public static final int BND_ICON_APPEND_BLEND;
    public static final int BND_ICON_IMPORT;
    public static final int BND_ICON_EXPORT;
    public static final int BND_ICON_EXTERNAL_DATA;
    public static final int BND_ICON_LOAD_FACTORY;
    public static final int BND_ICON_LOOP_BACK;
    public static final int BND_ICON_LOOP_FORWARDS;
    public static final int BND_ICON_BACK;
    public static final int BND_ICON_FORWARD;
    public static final int BND_ICON_FILE_BACKUP;
    public static final int BND_ICON_DISK_DRIVE;
    public static final int BND_ICON_MATPLANE;
    public static final int BND_ICON_MATSPHERE;
    public static final int BND_ICON_MATCUBE;
    public static final int BND_ICON_MONKEY;
    public static final int BND_ICON_HAIR;
    public static final int BND_ICON_ALIASED;
    public static final int BND_ICON_ANTIALIASED;
    public static final int BND_ICON_MAT_SPHERE_SKY;
    public static final int BND_ICON_WORDWRAP_OFF;
    public static final int BND_ICON_WORDWRAP_ON;
    public static final int BND_ICON_SYNTAX_OFF;
    public static final int BND_ICON_SYNTAX_ON;
    public static final int BND_ICON_LINENUMBERS_OFF;
    public static final int BND_ICON_LINENUMBERS_ON;
    public static final int BND_ICON_SCRIPTPLUGINS;
    public static final int BND_ICON_SEQ_SEQUENCER;
    public static final int BND_ICON_SEQ_PREVIEW;
    public static final int BND_ICON_SEQ_LUMA_WAVEFORM;
    public static final int BND_ICON_SEQ_CHROMA_SCOPE;
    public static final int BND_ICON_SEQ_HISTOGRAM;
    public static final int BND_ICON_SEQ_SPLITVIEW;
    public static final int BND_ICON_IMAGE_RGB;
    public static final int BND_ICON_IMAGE_RGB_ALPHA;
    public static final int BND_ICON_IMAGE_ALPHA;
    public static final int BND_ICON_IMAGE_ZDEPTH;
    public static final int BND_ICON_IMAGEFILE;

    protected Blendish() {
        throw new UnsupportedOperationException();
    }

    public static native void nbndSetTheme(long var0);

    public static void bndSetTheme(BNDtheme theme) {
        Blendish.nbndSetTheme(theme.address());
    }

    public static native long nbndGetTheme();

    @Nullable
    @NativeType(value="BNDtheme const *")
    public static BNDtheme bndGetTheme() {
        long __result = Blendish.nbndGetTheme();
        return BNDtheme.createSafe(__result);
    }

    public static native void bndSetIconImage(int var0);

    public static native void bndSetFont(int var0);

    public static native void nbndLabel(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndLabel(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndLabel(ctx, x, y, w, h, iconid, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndLabel(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndLabel(ctx, x, y, w, h, iconid, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndToolButton(long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9);

    public static void bndToolButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndToolButton(ctx, x, y, w, h, flags, state, iconid, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndToolButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndToolButton(ctx, x, y, w, h, flags, state, iconid, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndRadioButton(long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9);

    public static void bndRadioButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndRadioButton(ctx, x, y, w, h, flags, state, iconid, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndRadioButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndRadioButton(ctx, x, y, w, h, flags, state, iconid, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nbndTextFieldTextPosition(long var0, float var2, float var3, float var4, float var5, int var6, long var7, int var9, int var10);

    public static int bndTextFieldTextPosition(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer text, int px, int py) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(text);
        }
        return Blendish.nbndTextFieldTextPosition(ctx, x, y, w, h, iconid, MemoryUtil.memAddressSafe(text), px, py);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int bndTextFieldTextPosition(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType(value="char const *") CharSequence text, int px, int py) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(text, true);
            long textEncoded = text == null ? 0L : stack.getPointerAddress();
            int n = Blendish.nbndTextFieldTextPosition(ctx, x, y, w, h, iconid, textEncoded, px, py);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndTextField(long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9, int var11, int var12);

    public static void bndTextField(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer text, int cbegin, int cend) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(text);
        }
        Blendish.nbndTextField(ctx, x, y, w, h, flags, state, iconid, MemoryUtil.memAddressSafe(text), cbegin, cend);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndTextField(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") CharSequence text, int cbegin, int cend) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(text, true);
            long textEncoded = text == null ? 0L : stack.getPointerAddress();
            Blendish.nbndTextField(ctx, x, y, w, h, flags, state, iconid, textEncoded, cbegin, cend);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndOptionButton(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndOptionButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="BNDwidgetState") int state, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndOptionButton(ctx, x, y, w, h, state, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndOptionButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="BNDwidgetState") int state, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndOptionButton(ctx, x, y, w, h, state, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndChoiceButton(long var0, float var2, float var3, float var4, float var5, int var6, int var7, int var8, long var9);

    public static void bndChoiceButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndChoiceButton(ctx, x, y, w, h, flags, state, iconid, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndChoiceButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndChoiceButton(ctx, x, y, w, h, flags, state, iconid, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndColorButton(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndColorButton(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndColorButton(ctx, x, y, w, h, flags, color.address());
    }

    public static native void nbndNumberField(long var0, float var2, float var3, float var4, float var5, int var6, int var7, long var8, long var10);

    public static void bndNumberField(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, @Nullable @NativeType(value="char const *") ByteBuffer label, @Nullable @NativeType(value="char const *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
            Checks.checkNT1Safe(value);
        }
        Blendish.nbndNumberField(ctx, x, y, w, h, flags, state, MemoryUtil.memAddressSafe(label), MemoryUtil.memAddressSafe(value));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndNumberField(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, @Nullable @NativeType(value="char const *") CharSequence label, @Nullable @NativeType(value="char const *") CharSequence value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? 0L : stack.getPointerAddress();
            Blendish.nbndNumberField(ctx, x, y, w, h, flags, state, labelEncoded, valueEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndSlider(long var0, float var2, float var3, float var4, float var5, int var6, int var7, float var8, long var9, long var11);

    public static void bndSlider(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, float progress, @Nullable @NativeType(value="char const *") ByteBuffer label, @Nullable @NativeType(value="char const *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
            Checks.checkNT1Safe(value);
        }
        Blendish.nbndSlider(ctx, x, y, w, h, flags, state, progress, MemoryUtil.memAddressSafe(label), MemoryUtil.memAddressSafe(value));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndSlider(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType(value="BNDwidgetState") int state, float progress, @Nullable @NativeType(value="char const *") CharSequence label, @Nullable @NativeType(value="char const *") CharSequence value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? 0L : stack.getPointerAddress();
            Blendish.nbndSlider(ctx, x, y, w, h, flags, state, progress, labelEncoded, valueEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndScrollBar(long var0, float var2, float var3, float var4, float var5, int var6, float var7, float var8);

    public static void bndScrollBar(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="BNDwidgetState") int state, float offset, float size) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndScrollBar(ctx, x, y, w, h, state, offset, size);
    }

    public static native void nbndMenuBackground(long var0, float var2, float var3, float var4, float var5, int var6);

    public static void bndMenuBackground(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int flags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndMenuBackground(ctx, x, y, w, h, flags);
    }

    public static native void nbndMenuLabel(long var0, float var2, float var3, float var4, float var5, int var6, long var7);

    public static void bndMenuLabel(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndMenuLabel(ctx, x, y, w, h, iconid, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndMenuLabel(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndMenuLabel(ctx, x, y, w, h, iconid, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndMenuItem(long var0, float var2, float var3, float var4, float var5, int var6, int var7, long var8);

    public static void bndMenuItem(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndMenuItem(ctx, x, y, w, h, state, iconid, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndMenuItem(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndMenuItem(ctx, x, y, w, h, state, iconid, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndTooltipBackground(long var0, float var2, float var3, float var4, float var5);

    public static void bndTooltipBackground(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndTooltipBackground(ctx, x, y, w, h);
    }

    public static native void nbndNodePort(long var0, float var2, float var3, int var4, long var5);

    public static void bndNodePort(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="BNDwidgetState") int state, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndNodePort(ctx, x, y, state, color.address());
    }

    public static native void nbndNodeWire(long var0, float var2, float var3, float var4, float var5, int var6, int var7);

    public static void bndNodeWire(@NativeType(value="NVGcontext *") long ctx, float x0, float y0, float x1, float y1, @NativeType(value="BNDwidgetState") int state0, @NativeType(value="BNDwidgetState") int state1) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndNodeWire(ctx, x0, y0, x1, y1, state0, state1);
    }

    public static native void nbndColoredNodeWire(long var0, float var2, float var3, float var4, float var5, long var6, long var8);

    public static void bndColoredNodeWire(@NativeType(value="NVGcontext *") long ctx, float x0, float y0, float x1, float y1, @NativeType(value="NVGcolor") NVGColor color0, @NativeType(value="NVGcolor") NVGColor color1) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndColoredNodeWire(ctx, x0, y0, x1, y1, color0.address(), color1.address());
    }

    public static native void nbndNodeBackground(long var0, float var2, float var3, float var4, float var5, int var6, int var7, long var8, long var10);

    public static void bndNodeBackground(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label, @NativeType(value="NVGcolor") NVGColor titleColor) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndNodeBackground(ctx, x, y, w, h, state, iconid, MemoryUtil.memAddressSafe(label), titleColor.address());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndNodeBackground(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="BNDwidgetState") int state, int iconid, @Nullable @NativeType(value="char const *") CharSequence label, @NativeType(value="NVGcolor") NVGColor titleColor) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndNodeBackground(ctx, x, y, w, h, state, iconid, labelEncoded, titleColor.address());
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndSplitterWidgets(long var0, float var2, float var3, float var4, float var5);

    public static void bndSplitterWidgets(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndSplitterWidgets(ctx, x, y, w, h);
    }

    public static native void nbndJoinAreaOverlay(long var0, float var2, float var3, float var4, float var5, int var6, int var7);

    public static void bndJoinAreaOverlay(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType(value="int") boolean vertical, @NativeType(value="int") boolean mirror) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndJoinAreaOverlay(ctx, x, y, w, h, vertical ? 1 : 0, mirror ? 1 : 0);
    }

    public static native float nbndLabelWidth(long var0, int var2, long var3);

    public static float bndLabelWidth(@NativeType(value="NVGcontext *") long ctx, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        return Blendish.nbndLabelWidth(ctx, iconid, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float bndLabelWidth(@NativeType(value="NVGcontext *") long ctx, int iconid, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            float f = Blendish.nbndLabelWidth(ctx, iconid, labelEncoded);
            return f;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native float nbndLabelHeight(long var0, int var2, long var3, float var5);

    public static float bndLabelHeight(@NativeType(value="NVGcontext *") long ctx, int iconid, @Nullable @NativeType(value="char const *") ByteBuffer label, float width) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        return Blendish.nbndLabelHeight(ctx, iconid, MemoryUtil.memAddressSafe(label), width);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float bndLabelHeight(@NativeType(value="NVGcontext *") long ctx, int iconid, @Nullable @NativeType(value="char const *") CharSequence label, float width) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            float f = Blendish.nbndLabelHeight(ctx, iconid, labelEncoded, width);
            return f;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndTransparent(long var0, long var2);

    @NativeType(value="NVGcolor")
    public static NVGColor bndTransparent(@NativeType(value="NVGcolor") NVGColor color, @NativeType(value="NVGcolor") NVGColor __result) {
        Blendish.nbndTransparent(color.address(), __result.address());
        return __result;
    }

    public static native void nbndOffsetColor(long var0, int var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor bndOffsetColor(@NativeType(value="NVGcolor") NVGColor color, int delta, @NativeType(value="NVGcolor") NVGColor __result) {
        Blendish.nbndOffsetColor(color.address(), delta, __result.address());
        return __result;
    }

    public static native void nbndSelectCorners(long var0, float var2, int var3);

    public static void bndSelectCorners(@NativeType(value="float *") FloatBuffer radiuses, float r, int flags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)radiuses, 4);
        }
        Blendish.nbndSelectCorners(MemoryUtil.memAddress(radiuses), r, flags);
    }

    public static native void nbndInnerColors(long var0, long var2, long var4, int var6, int var7);

    public static void bndInnerColors(@NativeType(value="NVGcolor *") NVGColor shade_top, @NativeType(value="NVGcolor *") NVGColor shade_down, @NativeType(value="BNDwidgetTheme const *") BNDwidgetTheme theme, @NativeType(value="BNDwidgetState") int state, @NativeType(value="int") boolean flipActive) {
        Blendish.nbndInnerColors(shade_top.address(), shade_down.address(), theme.address(), state, flipActive ? 1 : 0);
    }

    public static native void nbndTextColor(long var0, int var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor bndTextColor(@NativeType(value="BNDwidgetTheme const *") BNDwidgetTheme theme, @NativeType(value="BNDwidgetState") int state, @NativeType(value="NVGcolor") NVGColor __result) {
        Blendish.nbndTextColor(theme.address(), state, __result.address());
        return __result;
    }

    public static native void nbndScrollHandleRect(long var0, long var2, long var4, long var6, float var8, float var9);

    public static void bndScrollHandleRect(@NativeType(value="float *") FloatBuffer x, @NativeType(value="float *") FloatBuffer y, @NativeType(value="float *") FloatBuffer w, @NativeType(value="float *") FloatBuffer h, float offset, float size) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)x, 1);
            Checks.check((Buffer)y, 1);
            Checks.check((Buffer)w, 1);
            Checks.check((Buffer)h, 1);
        }
        Blendish.nbndScrollHandleRect(MemoryUtil.memAddress(x), MemoryUtil.memAddress(y), MemoryUtil.memAddress(w), MemoryUtil.memAddress(h), offset, size);
    }

    public static native void nbndRoundedBox(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9);

    public static void bndRoundedBox(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndRoundedBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3);
    }

    public static native void nbndBackground(long var0, float var2, float var3, float var4, float var5);

    public static void bndBackground(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndBackground(ctx, x, y, w, h);
    }

    public static native void nbndBevel(long var0, float var2, float var3, float var4, float var5);

    public static void bndBevel(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndBevel(ctx, x, y, w, h);
    }

    public static native void nbndBevelInset(long var0, float var2, float var3, float var4, float var5, float var6, float var7);

    public static void bndBevelInset(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float cr2, float cr3) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndBevelInset(ctx, x, y, w, h, cr2, cr3);
    }

    public static native void nbndIcon(long var0, float var2, float var3, int var4);

    public static void bndIcon(@NativeType(value="NVGcontext *") long ctx, float x, float y, int iconid) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndIcon(ctx, x, y, iconid);
    }

    public static native void nbndDropShadow(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8);

    public static void bndDropShadow(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float r, float feather, float alpha) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndDropShadow(ctx, x, y, w, h, r, feather, alpha);
    }

    public static native void nbndInnerBox(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, long var10, long var12);

    public static void bndInnerBox(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, @NativeType(value="NVGcolor") NVGColor shade_top, @NativeType(value="NVGcolor") NVGColor shade_down) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndInnerBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, shade_top.address(), shade_down.address());
    }

    public static native void nbndOutlineBox(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, long var10);

    public static void bndOutlineBox(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndOutlineBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, color.address());
    }

    public static native void nbndIconLabelValue(long var0, float var2, float var3, float var4, float var5, int var6, long var7, int var9, float var10, long var11, long var13);

    public static void bndIconLabelValue(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType(value="NVGcolor") NVGColor color, int align, float fontsize, @Nullable @NativeType(value="char const *") ByteBuffer label, @Nullable @NativeType(value="char const *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
            Checks.checkNT1Safe(value);
        }
        Blendish.nbndIconLabelValue(ctx, x, y, w, h, iconid, color.address(), align, fontsize, MemoryUtil.memAddressSafe(label), MemoryUtil.memAddressSafe(value));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndIconLabelValue(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType(value="NVGcolor") NVGColor color, int align, float fontsize, @Nullable @NativeType(value="char const *") CharSequence label, @Nullable @NativeType(value="char const *") CharSequence value) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? 0L : stack.getPointerAddress();
            Blendish.nbndIconLabelValue(ctx, x, y, w, h, iconid, color.address(), align, fontsize, labelEncoded, valueEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndNodeIconLabel(long var0, float var2, float var3, float var4, float var5, int var6, long var7, long var9, int var11, float var12, long var13);

    public static void bndNodeIconLabel(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType(value="NVGcolor") NVGColor color, @NativeType(value="NVGcolor") NVGColor shadowColor, int align, float fontsize, @Nullable @NativeType(value="char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndNodeIconLabel(ctx, x, y, w, h, iconid, color.address(), shadowColor.address(), align, fontsize, MemoryUtil.memAddressSafe(label));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndNodeIconLabel(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType(value="NVGcolor") NVGColor color, @NativeType(value="NVGcolor") NVGColor shadowColor, int align, float fontsize, @Nullable @NativeType(value="char const *") CharSequence label) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndNodeIconLabel(ctx, x, y, w, h, iconid, color.address(), shadowColor.address(), align, fontsize, labelEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nbndIconLabelTextPosition(long var0, float var2, float var3, float var4, float var5, int var6, float var7, long var8, int var10, int var11);

    public static int bndIconLabelTextPosition(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, float fontsize, @Nullable @NativeType(value="char const *") ByteBuffer label, int px, int py) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        return Blendish.nbndIconLabelTextPosition(ctx, x, y, w, h, iconid, fontsize, MemoryUtil.memAddressSafe(label), px, py);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int bndIconLabelTextPosition(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, float fontsize, @Nullable @NativeType(value="char const *") CharSequence label, int px, int py) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            int n = Blendish.nbndIconLabelTextPosition(ctx, x, y, w, h, iconid, fontsize, labelEncoded, px, py);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndIconLabelCaret(long var0, float var2, float var3, float var4, float var5, int var6, long var7, float var9, long var10, long var12, int var14, int var15);

    public static void bndIconLabelCaret(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType(value="NVGcolor") NVGColor color, float fontsize, @Nullable @NativeType(value="char const *") ByteBuffer label, @NativeType(value="NVGcolor") NVGColor caretcolor, int cbegin, int cend) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1Safe(label);
        }
        Blendish.nbndIconLabelCaret(ctx, x, y, w, h, iconid, color.address(), fontsize, MemoryUtil.memAddressSafe(label), caretcolor.address(), cbegin, cend);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void bndIconLabelCaret(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType(value="NVGcolor") NVGColor color, float fontsize, @Nullable @NativeType(value="char const *") CharSequence label, @NativeType(value="NVGcolor") NVGColor caretcolor, int cbegin, int cend) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            Blendish.nbndIconLabelCaret(ctx, x, y, w, h, iconid, color.address(), fontsize, labelEncoded, caretcolor.address(), cbegin, cend);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nbndCheck(long var0, float var2, float var3, long var4);

    public static void bndCheck(@NativeType(value="NVGcontext *") long ctx, float ox, float oy, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndCheck(ctx, ox, oy, color.address());
    }

    public static native void nbndArrow(long var0, float var2, float var3, float var4, long var5);

    public static void bndArrow(@NativeType(value="NVGcontext *") long ctx, float x, float y, float s, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndArrow(ctx, x, y, s, color.address());
    }

    public static native void nbndUpDownArrow(long var0, float var2, float var3, float var4, long var5);

    public static void bndUpDownArrow(@NativeType(value="NVGcontext *") long ctx, float x, float y, float s, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndUpDownArrow(ctx, x, y, s, color.address());
    }

    public static native void nbndNodeArrowDown(long var0, float var2, float var3, float var4, long var5);

    public static void bndNodeArrowDown(@NativeType(value="NVGcontext *") long ctx, float x, float y, float s, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        Blendish.nbndNodeArrowDown(ctx, x, y, s, color.address());
    }

    public static native void nbndNodeWireColor(long var0, int var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor bndNodeWireColor(@NativeType(value="BNDnodeTheme const *") BNDnodeTheme theme, @NativeType(value="BNDwidgetState") int state, @NativeType(value="NVGcolor") NVGColor __result) {
        Blendish.nbndNodeWireColor(theme.address(), state, __result.address());
        return __result;
    }

    public static native void nbndSelectCorners(float[] var0, float var1, int var2);

    public static void bndSelectCorners(@NativeType(value="float *") float[] radiuses, float r, int flags) {
        if (Checks.CHECKS) {
            Checks.check(radiuses, 4);
        }
        Blendish.nbndSelectCorners(radiuses, r, flags);
    }

    public static native void nbndScrollHandleRect(float[] var0, float[] var1, float[] var2, float[] var3, float var4, float var5);

    public static void bndScrollHandleRect(@NativeType(value="float *") float[] x, @NativeType(value="float *") float[] y, @NativeType(value="float *") float[] w, @NativeType(value="float *") float[] h, float offset, float size) {
        if (Checks.CHECKS) {
            Checks.check(x, 1);
            Checks.check(y, 1);
            Checks.check(w, 1);
            Checks.check(h, 1);
        }
        Blendish.nbndScrollHandleRect(x, y, w, h, offset, size);
    }

    public static int BND_ICONID(int x, int y) {
        return x | y << 8;
    }

    static {
        LibNanoVG.initialize();
        BND_ICON_NONE = Blendish.BND_ICONID(0, 29);
        BND_ICON_QUESTION = Blendish.BND_ICONID(1, 29);
        BND_ICON_ERROR = Blendish.BND_ICONID(2, 29);
        BND_ICON_CANCEL = Blendish.BND_ICONID(3, 29);
        BND_ICON_TRIA_RIGHT = Blendish.BND_ICONID(4, 29);
        BND_ICON_TRIA_DOWN = Blendish.BND_ICONID(5, 29);
        BND_ICON_TRIA_LEFT = Blendish.BND_ICONID(6, 29);
        BND_ICON_TRIA_UP = Blendish.BND_ICONID(7, 29);
        BND_ICON_ARROW_LEFTRIGHT = Blendish.BND_ICONID(8, 29);
        BND_ICON_PLUS = Blendish.BND_ICONID(9, 29);
        BND_ICON_DISCLOSURE_TRI_DOWN = Blendish.BND_ICONID(10, 29);
        BND_ICON_DISCLOSURE_TRI_RIGHT = Blendish.BND_ICONID(11, 29);
        BND_ICON_RADIOBUT_OFF = Blendish.BND_ICONID(12, 29);
        BND_ICON_RADIOBUT_ON = Blendish.BND_ICONID(13, 29);
        BND_ICON_MENU_PANEL = Blendish.BND_ICONID(14, 29);
        BND_ICON_BLENDER = Blendish.BND_ICONID(15, 29);
        BND_ICON_GRIP = Blendish.BND_ICONID(16, 29);
        BND_ICON_DOT = Blendish.BND_ICONID(17, 29);
        BND_ICON_COLLAPSEMENU = Blendish.BND_ICONID(18, 29);
        BND_ICON_X = Blendish.BND_ICONID(19, 29);
        BND_ICON_GO_LEFT = Blendish.BND_ICONID(21, 29);
        BND_ICON_PLUG = Blendish.BND_ICONID(22, 29);
        BND_ICON_UI = Blendish.BND_ICONID(23, 29);
        BND_ICON_NODE = Blendish.BND_ICONID(24, 29);
        BND_ICON_NODE_SEL = Blendish.BND_ICONID(25, 29);
        BND_ICON_FULLSCREEN = Blendish.BND_ICONID(0, 28);
        BND_ICON_SPLITSCREEN = Blendish.BND_ICONID(1, 28);
        BND_ICON_RIGHTARROW_THIN = Blendish.BND_ICONID(2, 28);
        BND_ICON_BORDERMOVE = Blendish.BND_ICONID(3, 28);
        BND_ICON_VIEWZOOM = Blendish.BND_ICONID(4, 28);
        BND_ICON_ZOOMIN = Blendish.BND_ICONID(5, 28);
        BND_ICON_ZOOMOUT = Blendish.BND_ICONID(6, 28);
        BND_ICON_PANEL_CLOSE = Blendish.BND_ICONID(7, 28);
        BND_ICON_COPY_ID = Blendish.BND_ICONID(8, 28);
        BND_ICON_EYEDROPPER = Blendish.BND_ICONID(9, 28);
        BND_ICON_LINK_AREA = Blendish.BND_ICONID(10, 28);
        BND_ICON_AUTO = Blendish.BND_ICONID(11, 28);
        BND_ICON_CHECKBOX_DEHLT = Blendish.BND_ICONID(12, 28);
        BND_ICON_CHECKBOX_HLT = Blendish.BND_ICONID(13, 28);
        BND_ICON_UNLOCKED = Blendish.BND_ICONID(14, 28);
        BND_ICON_LOCKED = Blendish.BND_ICONID(15, 28);
        BND_ICON_UNPINNED = Blendish.BND_ICONID(16, 28);
        BND_ICON_PINNED = Blendish.BND_ICONID(17, 28);
        BND_ICON_SCREEN_BACK = Blendish.BND_ICONID(18, 28);
        BND_ICON_RIGHTARROW = Blendish.BND_ICONID(19, 28);
        BND_ICON_DOWNARROW_HLT = Blendish.BND_ICONID(20, 28);
        BND_ICON_DOTSUP = Blendish.BND_ICONID(21, 28);
        BND_ICON_DOTSDOWN = Blendish.BND_ICONID(22, 28);
        BND_ICON_LINK = Blendish.BND_ICONID(23, 28);
        BND_ICON_INLINK = Blendish.BND_ICONID(24, 28);
        BND_ICON_PLUGIN = Blendish.BND_ICONID(25, 28);
        BND_ICON_HELP = Blendish.BND_ICONID(0, 27);
        BND_ICON_GHOST_ENABLED = Blendish.BND_ICONID(1, 27);
        BND_ICON_COLOR = Blendish.BND_ICONID(2, 27);
        BND_ICON_LINKED = Blendish.BND_ICONID(3, 27);
        BND_ICON_UNLINKED = Blendish.BND_ICONID(4, 27);
        BND_ICON_HAND = Blendish.BND_ICONID(5, 27);
        BND_ICON_ZOOM_ALL = Blendish.BND_ICONID(6, 27);
        BND_ICON_ZOOM_SELECTED = Blendish.BND_ICONID(7, 27);
        BND_ICON_ZOOM_PREVIOUS = Blendish.BND_ICONID(8, 27);
        BND_ICON_ZOOM_IN = Blendish.BND_ICONID(9, 27);
        BND_ICON_ZOOM_OUT = Blendish.BND_ICONID(10, 27);
        BND_ICON_RENDER_REGION = Blendish.BND_ICONID(11, 27);
        BND_ICON_BORDER_RECT = Blendish.BND_ICONID(12, 27);
        BND_ICON_BORDER_LASSO = Blendish.BND_ICONID(13, 27);
        BND_ICON_FREEZE = Blendish.BND_ICONID(14, 27);
        BND_ICON_STYLUS_PRESSURE = Blendish.BND_ICONID(15, 27);
        BND_ICON_GHOST_DISABLED = Blendish.BND_ICONID(16, 27);
        BND_ICON_NEW = Blendish.BND_ICONID(17, 27);
        BND_ICON_FILE_TICK = Blendish.BND_ICONID(18, 27);
        BND_ICON_QUIT = Blendish.BND_ICONID(19, 27);
        BND_ICON_URL = Blendish.BND_ICONID(20, 27);
        BND_ICON_RECOVER_LAST = Blendish.BND_ICONID(21, 27);
        BND_ICON_FULLSCREEN_ENTER = Blendish.BND_ICONID(23, 27);
        BND_ICON_FULLSCREEN_EXIT = Blendish.BND_ICONID(24, 27);
        BND_ICON_BLANK1 = Blendish.BND_ICONID(25, 27);
        BND_ICON_LAMP = Blendish.BND_ICONID(0, 26);
        BND_ICON_MATERIAL = Blendish.BND_ICONID(1, 26);
        BND_ICON_TEXTURE = Blendish.BND_ICONID(2, 26);
        BND_ICON_ANIM = Blendish.BND_ICONID(3, 26);
        BND_ICON_WORLD = Blendish.BND_ICONID(4, 26);
        BND_ICON_SCENE = Blendish.BND_ICONID(5, 26);
        BND_ICON_EDIT = Blendish.BND_ICONID(6, 26);
        BND_ICON_GAME = Blendish.BND_ICONID(7, 26);
        BND_ICON_RADIO = Blendish.BND_ICONID(8, 26);
        BND_ICON_SCRIPT = Blendish.BND_ICONID(9, 26);
        BND_ICON_PARTICLES = Blendish.BND_ICONID(10, 26);
        BND_ICON_PHYSICS = Blendish.BND_ICONID(11, 26);
        BND_ICON_SPEAKER = Blendish.BND_ICONID(12, 26);
        BND_ICON_TEXTURE_SHADED = Blendish.BND_ICONID(13, 26);
        BND_ICON_VIEW3D = Blendish.BND_ICONID(0, 25);
        BND_ICON_IPO = Blendish.BND_ICONID(1, 25);
        BND_ICON_OOPS = Blendish.BND_ICONID(2, 25);
        BND_ICON_BUTS = Blendish.BND_ICONID(3, 25);
        BND_ICON_FILESEL = Blendish.BND_ICONID(4, 25);
        BND_ICON_IMAGE_COL = Blendish.BND_ICONID(5, 25);
        BND_ICON_INFO = Blendish.BND_ICONID(6, 25);
        BND_ICON_SEQUENCE = Blendish.BND_ICONID(7, 25);
        BND_ICON_TEXT = Blendish.BND_ICONID(8, 25);
        BND_ICON_IMASEL = Blendish.BND_ICONID(9, 25);
        BND_ICON_SOUND = Blendish.BND_ICONID(10, 25);
        BND_ICON_ACTION = Blendish.BND_ICONID(11, 25);
        BND_ICON_NLA = Blendish.BND_ICONID(12, 25);
        BND_ICON_SCRIPTWIN = Blendish.BND_ICONID(13, 25);
        BND_ICON_TIME = Blendish.BND_ICONID(14, 25);
        BND_ICON_NODETREE = Blendish.BND_ICONID(15, 25);
        BND_ICON_LOGIC = Blendish.BND_ICONID(16, 25);
        BND_ICON_CONSOLE = Blendish.BND_ICONID(17, 25);
        BND_ICON_PREFERENCES = Blendish.BND_ICONID(18, 25);
        BND_ICON_CLIP = Blendish.BND_ICONID(19, 25);
        BND_ICON_ASSET_MANAGER = Blendish.BND_ICONID(20, 25);
        BND_ICON_OBJECT_DATAMODE = Blendish.BND_ICONID(0, 24);
        BND_ICON_EDITMODE_HLT = Blendish.BND_ICONID(1, 24);
        BND_ICON_FACESEL_HLT = Blendish.BND_ICONID(2, 24);
        BND_ICON_VPAINT_HLT = Blendish.BND_ICONID(3, 24);
        BND_ICON_TPAINT_HLT = Blendish.BND_ICONID(4, 24);
        BND_ICON_WPAINT_HLT = Blendish.BND_ICONID(5, 24);
        BND_ICON_SCULPTMODE_HLT = Blendish.BND_ICONID(6, 24);
        BND_ICON_POSE_HLT = Blendish.BND_ICONID(7, 24);
        BND_ICON_PARTICLEMODE = Blendish.BND_ICONID(8, 24);
        BND_ICON_LIGHTPAINT = Blendish.BND_ICONID(9, 24);
        BND_ICON_SCENE_DATA = Blendish.BND_ICONID(0, 23);
        BND_ICON_RENDERLAYERS = Blendish.BND_ICONID(1, 23);
        BND_ICON_WORLD_DATA = Blendish.BND_ICONID(2, 23);
        BND_ICON_OBJECT_DATA = Blendish.BND_ICONID(3, 23);
        BND_ICON_MESH_DATA = Blendish.BND_ICONID(4, 23);
        BND_ICON_CURVE_DATA = Blendish.BND_ICONID(5, 23);
        BND_ICON_META_DATA = Blendish.BND_ICONID(6, 23);
        BND_ICON_LATTICE_DATA = Blendish.BND_ICONID(7, 23);
        BND_ICON_LAMP_DATA = Blendish.BND_ICONID(8, 23);
        BND_ICON_MATERIAL_DATA = Blendish.BND_ICONID(9, 23);
        BND_ICON_TEXTURE_DATA = Blendish.BND_ICONID(10, 23);
        BND_ICON_ANIM_DATA = Blendish.BND_ICONID(11, 23);
        BND_ICON_CAMERA_DATA = Blendish.BND_ICONID(12, 23);
        BND_ICON_PARTICLE_DATA = Blendish.BND_ICONID(13, 23);
        BND_ICON_LIBRARY_DATA_DIRECT = Blendish.BND_ICONID(14, 23);
        BND_ICON_GROUP = Blendish.BND_ICONID(15, 23);
        BND_ICON_ARMATURE_DATA = Blendish.BND_ICONID(16, 23);
        BND_ICON_POSE_DATA = Blendish.BND_ICONID(17, 23);
        BND_ICON_BONE_DATA = Blendish.BND_ICONID(18, 23);
        BND_ICON_CONSTRAINT = Blendish.BND_ICONID(19, 23);
        BND_ICON_SHAPEKEY_DATA = Blendish.BND_ICONID(20, 23);
        BND_ICON_CONSTRAINT_BONE = Blendish.BND_ICONID(21, 23);
        BND_ICON_CAMERA_STEREO = Blendish.BND_ICONID(22, 23);
        BND_ICON_PACKAGE = Blendish.BND_ICONID(23, 23);
        BND_ICON_UGLYPACKAGE = Blendish.BND_ICONID(24, 23);
        BND_ICON_BRUSH_DATA = Blendish.BND_ICONID(0, 22);
        BND_ICON_IMAGE_DATA = Blendish.BND_ICONID(1, 22);
        BND_ICON_FILE = Blendish.BND_ICONID(2, 22);
        BND_ICON_FCURVE = Blendish.BND_ICONID(3, 22);
        BND_ICON_FONT_DATA = Blendish.BND_ICONID(4, 22);
        BND_ICON_RENDER_RESULT = Blendish.BND_ICONID(5, 22);
        BND_ICON_SURFACE_DATA = Blendish.BND_ICONID(6, 22);
        BND_ICON_EMPTY_DATA = Blendish.BND_ICONID(7, 22);
        BND_ICON_SETTINGS = Blendish.BND_ICONID(8, 22);
        BND_ICON_RENDER_ANIMATION = Blendish.BND_ICONID(9, 22);
        BND_ICON_RENDER_STILL = Blendish.BND_ICONID(10, 22);
        BND_ICON_BOIDS = Blendish.BND_ICONID(12, 22);
        BND_ICON_STRANDS = Blendish.BND_ICONID(13, 22);
        BND_ICON_LIBRARY_DATA_INDIRECT = Blendish.BND_ICONID(14, 22);
        BND_ICON_GREASEPENCIL = Blendish.BND_ICONID(15, 22);
        BND_ICON_LINE_DATA = Blendish.BND_ICONID(16, 22);
        BND_ICON_GROUP_BONE = Blendish.BND_ICONID(18, 22);
        BND_ICON_GROUP_VERTEX = Blendish.BND_ICONID(19, 22);
        BND_ICON_GROUP_VCOL = Blendish.BND_ICONID(20, 22);
        BND_ICON_GROUP_UVS = Blendish.BND_ICONID(21, 22);
        BND_ICON_RNA = Blendish.BND_ICONID(24, 22);
        BND_ICON_RNA_ADD = Blendish.BND_ICONID(25, 22);
        BND_ICON_OUTLINER_OB_EMPTY = Blendish.BND_ICONID(0, 20);
        BND_ICON_OUTLINER_OB_MESH = Blendish.BND_ICONID(1, 20);
        BND_ICON_OUTLINER_OB_CURVE = Blendish.BND_ICONID(2, 20);
        BND_ICON_OUTLINER_OB_LATTICE = Blendish.BND_ICONID(3, 20);
        BND_ICON_OUTLINER_OB_META = Blendish.BND_ICONID(4, 20);
        BND_ICON_OUTLINER_OB_LAMP = Blendish.BND_ICONID(5, 20);
        BND_ICON_OUTLINER_OB_CAMERA = Blendish.BND_ICONID(6, 20);
        BND_ICON_OUTLINER_OB_ARMATURE = Blendish.BND_ICONID(7, 20);
        BND_ICON_OUTLINER_OB_FONT = Blendish.BND_ICONID(8, 20);
        BND_ICON_OUTLINER_OB_SURFACE = Blendish.BND_ICONID(9, 20);
        BND_ICON_OUTLINER_OB_SPEAKER = Blendish.BND_ICONID(10, 20);
        BND_ICON_RESTRICT_VIEW_OFF = Blendish.BND_ICONID(19, 20);
        BND_ICON_RESTRICT_VIEW_ON = Blendish.BND_ICONID(20, 20);
        BND_ICON_RESTRICT_SELECT_OFF = Blendish.BND_ICONID(21, 20);
        BND_ICON_RESTRICT_SELECT_ON = Blendish.BND_ICONID(22, 20);
        BND_ICON_RESTRICT_RENDER_OFF = Blendish.BND_ICONID(23, 20);
        BND_ICON_RESTRICT_RENDER_ON = Blendish.BND_ICONID(24, 20);
        BND_ICON_OUTLINER_DATA_EMPTY = Blendish.BND_ICONID(0, 19);
        BND_ICON_OUTLINER_DATA_MESH = Blendish.BND_ICONID(1, 19);
        BND_ICON_OUTLINER_DATA_CURVE = Blendish.BND_ICONID(2, 19);
        BND_ICON_OUTLINER_DATA_LATTICE = Blendish.BND_ICONID(3, 19);
        BND_ICON_OUTLINER_DATA_META = Blendish.BND_ICONID(4, 19);
        BND_ICON_OUTLINER_DATA_LAMP = Blendish.BND_ICONID(5, 19);
        BND_ICON_OUTLINER_DATA_CAMERA = Blendish.BND_ICONID(6, 19);
        BND_ICON_OUTLINER_DATA_ARMATURE = Blendish.BND_ICONID(7, 19);
        BND_ICON_OUTLINER_DATA_FONT = Blendish.BND_ICONID(8, 19);
        BND_ICON_OUTLINER_DATA_SURFACE = Blendish.BND_ICONID(9, 19);
        BND_ICON_OUTLINER_DATA_SPEAKER = Blendish.BND_ICONID(10, 19);
        BND_ICON_OUTLINER_DATA_POSE = Blendish.BND_ICONID(11, 19);
        BND_ICON_MESH_PLANE = Blendish.BND_ICONID(0, 18);
        BND_ICON_MESH_CUBE = Blendish.BND_ICONID(1, 18);
        BND_ICON_MESH_CIRCLE = Blendish.BND_ICONID(2, 18);
        BND_ICON_MESH_UVSPHERE = Blendish.BND_ICONID(3, 18);
        BND_ICON_MESH_ICOSPHERE = Blendish.BND_ICONID(4, 18);
        BND_ICON_MESH_GRID = Blendish.BND_ICONID(5, 18);
        BND_ICON_MESH_MONKEY = Blendish.BND_ICONID(6, 18);
        BND_ICON_MESH_CYLINDER = Blendish.BND_ICONID(7, 18);
        BND_ICON_MESH_TORUS = Blendish.BND_ICONID(8, 18);
        BND_ICON_MESH_CONE = Blendish.BND_ICONID(9, 18);
        BND_ICON_LAMP_POINT = Blendish.BND_ICONID(12, 18);
        BND_ICON_LAMP_SUN = Blendish.BND_ICONID(13, 18);
        BND_ICON_LAMP_SPOT = Blendish.BND_ICONID(14, 18);
        BND_ICON_LAMP_HEMI = Blendish.BND_ICONID(15, 18);
        BND_ICON_LAMP_AREA = Blendish.BND_ICONID(16, 18);
        BND_ICON_META_EMPTY = Blendish.BND_ICONID(19, 18);
        BND_ICON_META_PLANE = Blendish.BND_ICONID(20, 18);
        BND_ICON_META_CUBE = Blendish.BND_ICONID(21, 18);
        BND_ICON_META_BALL = Blendish.BND_ICONID(22, 18);
        BND_ICON_META_ELLIPSOID = Blendish.BND_ICONID(23, 18);
        BND_ICON_META_CAPSULE = Blendish.BND_ICONID(24, 18);
        BND_ICON_SURFACE_NCURVE = Blendish.BND_ICONID(0, 17);
        BND_ICON_SURFACE_NCIRCLE = Blendish.BND_ICONID(1, 17);
        BND_ICON_SURFACE_NSURFACE = Blendish.BND_ICONID(2, 17);
        BND_ICON_SURFACE_NCYLINDER = Blendish.BND_ICONID(3, 17);
        BND_ICON_SURFACE_NSPHERE = Blendish.BND_ICONID(4, 17);
        BND_ICON_SURFACE_NTORUS = Blendish.BND_ICONID(5, 17);
        BND_ICON_CURVE_BEZCURVE = Blendish.BND_ICONID(9, 17);
        BND_ICON_CURVE_BEZCIRCLE = Blendish.BND_ICONID(10, 17);
        BND_ICON_CURVE_NCURVE = Blendish.BND_ICONID(11, 17);
        BND_ICON_CURVE_NCIRCLE = Blendish.BND_ICONID(12, 17);
        BND_ICON_CURVE_PATH = Blendish.BND_ICONID(13, 17);
        BND_ICON_COLOR_RED = Blendish.BND_ICONID(19, 17);
        BND_ICON_COLOR_GREEN = Blendish.BND_ICONID(20, 17);
        BND_ICON_COLOR_BLUE = Blendish.BND_ICONID(21, 17);
        BND_ICON_FORCE_FORCE = Blendish.BND_ICONID(0, 16);
        BND_ICON_FORCE_WIND = Blendish.BND_ICONID(1, 16);
        BND_ICON_FORCE_VORTEX = Blendish.BND_ICONID(2, 16);
        BND_ICON_FORCE_MAGNETIC = Blendish.BND_ICONID(3, 16);
        BND_ICON_FORCE_HARMONIC = Blendish.BND_ICONID(4, 16);
        BND_ICON_FORCE_CHARGE = Blendish.BND_ICONID(5, 16);
        BND_ICON_FORCE_LENNARDJONES = Blendish.BND_ICONID(6, 16);
        BND_ICON_FORCE_TEXTURE = Blendish.BND_ICONID(7, 16);
        BND_ICON_FORCE_CURVE = Blendish.BND_ICONID(8, 16);
        BND_ICON_FORCE_BOID = Blendish.BND_ICONID(9, 16);
        BND_ICON_FORCE_TURBULENCE = Blendish.BND_ICONID(10, 16);
        BND_ICON_FORCE_DRAG = Blendish.BND_ICONID(11, 16);
        BND_ICON_FORCE_SMOKEFLOW = Blendish.BND_ICONID(12, 16);
        BND_ICON_MODIFIER = Blendish.BND_ICONID(0, 12);
        BND_ICON_MOD_WAVE = Blendish.BND_ICONID(1, 12);
        BND_ICON_MOD_BUILD = Blendish.BND_ICONID(2, 12);
        BND_ICON_MOD_DECIM = Blendish.BND_ICONID(3, 12);
        BND_ICON_MOD_MIRROR = Blendish.BND_ICONID(4, 12);
        BND_ICON_MOD_SOFT = Blendish.BND_ICONID(5, 12);
        BND_ICON_MOD_SUBSURF = Blendish.BND_ICONID(6, 12);
        BND_ICON_HOOK = Blendish.BND_ICONID(7, 12);
        BND_ICON_MOD_PHYSICS = Blendish.BND_ICONID(8, 12);
        BND_ICON_MOD_PARTICLES = Blendish.BND_ICONID(9, 12);
        BND_ICON_MOD_BOOLEAN = Blendish.BND_ICONID(10, 12);
        BND_ICON_MOD_EDGESPLIT = Blendish.BND_ICONID(11, 12);
        BND_ICON_MOD_ARRAY = Blendish.BND_ICONID(12, 12);
        BND_ICON_MOD_UVPROJECT = Blendish.BND_ICONID(13, 12);
        BND_ICON_MOD_DISPLACE = Blendish.BND_ICONID(14, 12);
        BND_ICON_MOD_CURVE = Blendish.BND_ICONID(15, 12);
        BND_ICON_MOD_LATTICE = Blendish.BND_ICONID(16, 12);
        BND_ICON_CONSTRAINT_DATA = Blendish.BND_ICONID(17, 12);
        BND_ICON_MOD_ARMATURE = Blendish.BND_ICONID(18, 12);
        BND_ICON_MOD_SHRINKWRAP = Blendish.BND_ICONID(19, 12);
        BND_ICON_MOD_CAST = Blendish.BND_ICONID(20, 12);
        BND_ICON_MOD_MESHDEFORM = Blendish.BND_ICONID(21, 12);
        BND_ICON_MOD_BEVEL = Blendish.BND_ICONID(22, 12);
        BND_ICON_MOD_SMOOTH = Blendish.BND_ICONID(23, 12);
        BND_ICON_MOD_SIMPLEDEFORM = Blendish.BND_ICONID(24, 12);
        BND_ICON_MOD_MASK = Blendish.BND_ICONID(25, 12);
        BND_ICON_MOD_CLOTH = Blendish.BND_ICONID(0, 11);
        BND_ICON_MOD_EXPLODE = Blendish.BND_ICONID(1, 11);
        BND_ICON_MOD_FLUIDSIM = Blendish.BND_ICONID(2, 11);
        BND_ICON_MOD_MULTIRES = Blendish.BND_ICONID(3, 11);
        BND_ICON_MOD_SMOKE = Blendish.BND_ICONID(4, 11);
        BND_ICON_MOD_SOLIDIFY = Blendish.BND_ICONID(5, 11);
        BND_ICON_MOD_SCREW = Blendish.BND_ICONID(6, 11);
        BND_ICON_MOD_VERTEX_WEIGHT = Blendish.BND_ICONID(7, 11);
        BND_ICON_MOD_DYNAMICPAINT = Blendish.BND_ICONID(8, 11);
        BND_ICON_MOD_REMESH = Blendish.BND_ICONID(9, 11);
        BND_ICON_MOD_OCEAN = Blendish.BND_ICONID(10, 11);
        BND_ICON_MOD_WARP = Blendish.BND_ICONID(11, 11);
        BND_ICON_MOD_SKIN = Blendish.BND_ICONID(12, 11);
        BND_ICON_MOD_TRIANGULATE = Blendish.BND_ICONID(13, 11);
        BND_ICON_MOD_WIREFRAME = Blendish.BND_ICONID(14, 11);
        BND_ICON_REC = Blendish.BND_ICONID(0, 10);
        BND_ICON_PLAY = Blendish.BND_ICONID(1, 10);
        BND_ICON_FF = Blendish.BND_ICONID(2, 10);
        BND_ICON_REW = Blendish.BND_ICONID(3, 10);
        BND_ICON_PAUSE = Blendish.BND_ICONID(4, 10);
        BND_ICON_PREV_KEYFRAME = Blendish.BND_ICONID(5, 10);
        BND_ICON_NEXT_KEYFRAME = Blendish.BND_ICONID(6, 10);
        BND_ICON_PLAY_AUDIO = Blendish.BND_ICONID(7, 10);
        BND_ICON_PLAY_REVERSE = Blendish.BND_ICONID(8, 10);
        BND_ICON_PREVIEW_RANGE = Blendish.BND_ICONID(9, 10);
        BND_ICON_ACTION_TWEAK = Blendish.BND_ICONID(10, 10);
        BND_ICON_PMARKER_ACT = Blendish.BND_ICONID(11, 10);
        BND_ICON_PMARKER_SEL = Blendish.BND_ICONID(12, 10);
        BND_ICON_PMARKER = Blendish.BND_ICONID(13, 10);
        BND_ICON_MARKER_HLT = Blendish.BND_ICONID(14, 10);
        BND_ICON_MARKER = Blendish.BND_ICONID(15, 10);
        BND_ICON_SPACE2 = Blendish.BND_ICONID(16, 10);
        BND_ICON_SPACE3 = Blendish.BND_ICONID(17, 10);
        BND_ICON_KEYINGSET = Blendish.BND_ICONID(18, 10);
        BND_ICON_KEY_DEHLT = Blendish.BND_ICONID(19, 10);
        BND_ICON_KEY_HLT = Blendish.BND_ICONID(20, 10);
        BND_ICON_MUTE_IPO_OFF = Blendish.BND_ICONID(21, 10);
        BND_ICON_MUTE_IPO_ON = Blendish.BND_ICONID(22, 10);
        BND_ICON_VISIBLE_IPO_OFF = Blendish.BND_ICONID(23, 10);
        BND_ICON_VISIBLE_IPO_ON = Blendish.BND_ICONID(24, 10);
        BND_ICON_DRIVER = Blendish.BND_ICONID(25, 10);
        BND_ICON_SOLO_OFF = Blendish.BND_ICONID(0, 9);
        BND_ICON_SOLO_ON = Blendish.BND_ICONID(1, 9);
        BND_ICON_FRAME_PREV = Blendish.BND_ICONID(2, 9);
        BND_ICON_FRAME_NEXT = Blendish.BND_ICONID(3, 9);
        BND_ICON_NLA_PUSHDOWN = Blendish.BND_ICONID(4, 9);
        BND_ICON_IPO_CONSTANT = Blendish.BND_ICONID(5, 9);
        BND_ICON_IPO_LINEAR = Blendish.BND_ICONID(6, 9);
        BND_ICON_IPO_BEZIER = Blendish.BND_ICONID(7, 9);
        BND_ICON_IPO_SINE = Blendish.BND_ICONID(8, 9);
        BND_ICON_IPO_QUAD = Blendish.BND_ICONID(9, 9);
        BND_ICON_IPO_CUBIC = Blendish.BND_ICONID(10, 9);
        BND_ICON_IPO_QUART = Blendish.BND_ICONID(11, 9);
        BND_ICON_IPO_QUINT = Blendish.BND_ICONID(12, 9);
        BND_ICON_IPO_EXPO = Blendish.BND_ICONID(13, 9);
        BND_ICON_IPO_CIRC = Blendish.BND_ICONID(14, 9);
        BND_ICON_IPO_BOUNCE = Blendish.BND_ICONID(15, 9);
        BND_ICON_IPO_ELASTIC = Blendish.BND_ICONID(16, 9);
        BND_ICON_IPO_BACK = Blendish.BND_ICONID(17, 9);
        BND_ICON_IPO_EASE_IN = Blendish.BND_ICONID(18, 9);
        BND_ICON_IPO_EASE_OUT = Blendish.BND_ICONID(19, 9);
        BND_ICON_IPO_EASE_IN_OUT = Blendish.BND_ICONID(20, 9);
        BND_ICON_VERTEXSEL = Blendish.BND_ICONID(0, 8);
        BND_ICON_EDGESEL = Blendish.BND_ICONID(1, 8);
        BND_ICON_FACESEL = Blendish.BND_ICONID(2, 8);
        BND_ICON_LOOPSEL = Blendish.BND_ICONID(3, 8);
        BND_ICON_ROTATE = Blendish.BND_ICONID(5, 8);
        BND_ICON_CURSOR = Blendish.BND_ICONID(6, 8);
        BND_ICON_ROTATECOLLECTION = Blendish.BND_ICONID(7, 8);
        BND_ICON_ROTATECENTER = Blendish.BND_ICONID(8, 8);
        BND_ICON_ROTACTIVE = Blendish.BND_ICONID(9, 8);
        BND_ICON_ALIGN = Blendish.BND_ICONID(10, 8);
        BND_ICON_SMOOTHCURVE = Blendish.BND_ICONID(12, 8);
        BND_ICON_SPHERECURVE = Blendish.BND_ICONID(13, 8);
        BND_ICON_ROOTCURVE = Blendish.BND_ICONID(14, 8);
        BND_ICON_SHARPCURVE = Blendish.BND_ICONID(15, 8);
        BND_ICON_LINCURVE = Blendish.BND_ICONID(16, 8);
        BND_ICON_NOCURVE = Blendish.BND_ICONID(17, 8);
        BND_ICON_RNDCURVE = Blendish.BND_ICONID(18, 8);
        BND_ICON_PROP_OFF = Blendish.BND_ICONID(19, 8);
        BND_ICON_PROP_ON = Blendish.BND_ICONID(20, 8);
        BND_ICON_PROP_CON = Blendish.BND_ICONID(21, 8);
        BND_ICON_SCULPT_DYNTOPO = Blendish.BND_ICONID(22, 8);
        BND_ICON_PARTICLE_POINT = Blendish.BND_ICONID(23, 8);
        BND_ICON_PARTICLE_TIP = Blendish.BND_ICONID(24, 8);
        BND_ICON_PARTICLE_PATH = Blendish.BND_ICONID(25, 8);
        BND_ICON_MAN_TRANS = Blendish.BND_ICONID(0, 7);
        BND_ICON_MAN_ROT = Blendish.BND_ICONID(1, 7);
        BND_ICON_MAN_SCALE = Blendish.BND_ICONID(2, 7);
        BND_ICON_MANIPUL = Blendish.BND_ICONID(3, 7);
        BND_ICON_SNAP_OFF = Blendish.BND_ICONID(4, 7);
        BND_ICON_SNAP_ON = Blendish.BND_ICONID(5, 7);
        BND_ICON_SNAP_NORMAL = Blendish.BND_ICONID(6, 7);
        BND_ICON_SNAP_INCREMENT = Blendish.BND_ICONID(7, 7);
        BND_ICON_SNAP_VERTEX = Blendish.BND_ICONID(8, 7);
        BND_ICON_SNAP_EDGE = Blendish.BND_ICONID(9, 7);
        BND_ICON_SNAP_FACE = Blendish.BND_ICONID(10, 7);
        BND_ICON_SNAP_VOLUME = Blendish.BND_ICONID(11, 7);
        BND_ICON_STICKY_UVS_LOC = Blendish.BND_ICONID(13, 7);
        BND_ICON_STICKY_UVS_DISABLE = Blendish.BND_ICONID(14, 7);
        BND_ICON_STICKY_UVS_VERT = Blendish.BND_ICONID(15, 7);
        BND_ICON_CLIPUV_DEHLT = Blendish.BND_ICONID(16, 7);
        BND_ICON_CLIPUV_HLT = Blendish.BND_ICONID(17, 7);
        BND_ICON_SNAP_PEEL_OBJECT = Blendish.BND_ICONID(18, 7);
        BND_ICON_GRID = Blendish.BND_ICONID(19, 7);
        BND_ICON_PASTEDOWN = Blendish.BND_ICONID(0, 6);
        BND_ICON_COPYDOWN = Blendish.BND_ICONID(1, 6);
        BND_ICON_PASTEFLIPUP = Blendish.BND_ICONID(2, 6);
        BND_ICON_PASTEFLIPDOWN = Blendish.BND_ICONID(3, 6);
        BND_ICON_SNAP_SURFACE = Blendish.BND_ICONID(8, 6);
        BND_ICON_AUTOMERGE_ON = Blendish.BND_ICONID(9, 6);
        BND_ICON_AUTOMERGE_OFF = Blendish.BND_ICONID(10, 6);
        BND_ICON_RETOPO = Blendish.BND_ICONID(11, 6);
        BND_ICON_UV_VERTEXSEL = Blendish.BND_ICONID(12, 6);
        BND_ICON_UV_EDGESEL = Blendish.BND_ICONID(13, 6);
        BND_ICON_UV_FACESEL = Blendish.BND_ICONID(14, 6);
        BND_ICON_UV_ISLANDSEL = Blendish.BND_ICONID(15, 6);
        BND_ICON_UV_SYNC_SELECT = Blendish.BND_ICONID(16, 6);
        BND_ICON_BBOX = Blendish.BND_ICONID(0, 5);
        BND_ICON_WIRE = Blendish.BND_ICONID(1, 5);
        BND_ICON_SOLID = Blendish.BND_ICONID(2, 5);
        BND_ICON_SMOOTH = Blendish.BND_ICONID(3, 5);
        BND_ICON_POTATO = Blendish.BND_ICONID(4, 5);
        BND_ICON_ORTHO = Blendish.BND_ICONID(6, 5);
        BND_ICON_LOCKVIEW_OFF = Blendish.BND_ICONID(9, 5);
        BND_ICON_LOCKVIEW_ON = Blendish.BND_ICONID(10, 5);
        BND_ICON_AXIS_SIDE = Blendish.BND_ICONID(12, 5);
        BND_ICON_AXIS_FRONT = Blendish.BND_ICONID(13, 5);
        BND_ICON_AXIS_TOP = Blendish.BND_ICONID(14, 5);
        BND_ICON_NDOF_DOM = Blendish.BND_ICONID(15, 5);
        BND_ICON_NDOF_TURN = Blendish.BND_ICONID(16, 5);
        BND_ICON_NDOF_FLY = Blendish.BND_ICONID(17, 5);
        BND_ICON_NDOF_TRANS = Blendish.BND_ICONID(18, 5);
        BND_ICON_LAYER_USED = Blendish.BND_ICONID(19, 5);
        BND_ICON_LAYER_ACTIVE = Blendish.BND_ICONID(20, 5);
        BND_ICON_SORTALPHA = Blendish.BND_ICONID(0, 3);
        BND_ICON_SORTBYEXT = Blendish.BND_ICONID(1, 3);
        BND_ICON_SORTTIME = Blendish.BND_ICONID(2, 3);
        BND_ICON_SORTSIZE = Blendish.BND_ICONID(3, 3);
        BND_ICON_LONGDISPLAY = Blendish.BND_ICONID(4, 3);
        BND_ICON_SHORTDISPLAY = Blendish.BND_ICONID(5, 3);
        BND_ICON_GHOST = Blendish.BND_ICONID(6, 3);
        BND_ICON_IMGDISPLAY = Blendish.BND_ICONID(7, 3);
        BND_ICON_SAVE_AS = Blendish.BND_ICONID(8, 3);
        BND_ICON_SAVE_COPY = Blendish.BND_ICONID(9, 3);
        BND_ICON_BOOKMARKS = Blendish.BND_ICONID(10, 3);
        BND_ICON_FONTPREVIEW = Blendish.BND_ICONID(11, 3);
        BND_ICON_FILTER = Blendish.BND_ICONID(12, 3);
        BND_ICON_NEWFOLDER = Blendish.BND_ICONID(13, 3);
        BND_ICON_OPEN_RECENT = Blendish.BND_ICONID(14, 3);
        BND_ICON_FILE_PARENT = Blendish.BND_ICONID(15, 3);
        BND_ICON_FILE_REFRESH = Blendish.BND_ICONID(16, 3);
        BND_ICON_FILE_FOLDER = Blendish.BND_ICONID(17, 3);
        BND_ICON_FILE_BLANK = Blendish.BND_ICONID(18, 3);
        BND_ICON_FILE_BLEND = Blendish.BND_ICONID(19, 3);
        BND_ICON_FILE_IMAGE = Blendish.BND_ICONID(20, 3);
        BND_ICON_FILE_MOVIE = Blendish.BND_ICONID(21, 3);
        BND_ICON_FILE_SCRIPT = Blendish.BND_ICONID(22, 3);
        BND_ICON_FILE_SOUND = Blendish.BND_ICONID(23, 3);
        BND_ICON_FILE_FONT = Blendish.BND_ICONID(24, 3);
        BND_ICON_FILE_TEXT = Blendish.BND_ICONID(25, 3);
        BND_ICON_RECOVER_AUTO = Blendish.BND_ICONID(0, 2);
        BND_ICON_SAVE_PREFS = Blendish.BND_ICONID(1, 2);
        BND_ICON_LINK_BLEND = Blendish.BND_ICONID(2, 2);
        BND_ICON_APPEND_BLEND = Blendish.BND_ICONID(3, 2);
        BND_ICON_IMPORT = Blendish.BND_ICONID(4, 2);
        BND_ICON_EXPORT = Blendish.BND_ICONID(5, 2);
        BND_ICON_EXTERNAL_DATA = Blendish.BND_ICONID(6, 2);
        BND_ICON_LOAD_FACTORY = Blendish.BND_ICONID(7, 2);
        BND_ICON_LOOP_BACK = Blendish.BND_ICONID(13, 2);
        BND_ICON_LOOP_FORWARDS = Blendish.BND_ICONID(14, 2);
        BND_ICON_BACK = Blendish.BND_ICONID(15, 2);
        BND_ICON_FORWARD = Blendish.BND_ICONID(16, 2);
        BND_ICON_FILE_BACKUP = Blendish.BND_ICONID(24, 2);
        BND_ICON_DISK_DRIVE = Blendish.BND_ICONID(25, 2);
        BND_ICON_MATPLANE = Blendish.BND_ICONID(0, 1);
        BND_ICON_MATSPHERE = Blendish.BND_ICONID(1, 1);
        BND_ICON_MATCUBE = Blendish.BND_ICONID(2, 1);
        BND_ICON_MONKEY = Blendish.BND_ICONID(3, 1);
        BND_ICON_HAIR = Blendish.BND_ICONID(4, 1);
        BND_ICON_ALIASED = Blendish.BND_ICONID(5, 1);
        BND_ICON_ANTIALIASED = Blendish.BND_ICONID(6, 1);
        BND_ICON_MAT_SPHERE_SKY = Blendish.BND_ICONID(7, 1);
        BND_ICON_WORDWRAP_OFF = Blendish.BND_ICONID(12, 1);
        BND_ICON_WORDWRAP_ON = Blendish.BND_ICONID(13, 1);
        BND_ICON_SYNTAX_OFF = Blendish.BND_ICONID(14, 1);
        BND_ICON_SYNTAX_ON = Blendish.BND_ICONID(15, 1);
        BND_ICON_LINENUMBERS_OFF = Blendish.BND_ICONID(16, 1);
        BND_ICON_LINENUMBERS_ON = Blendish.BND_ICONID(17, 1);
        BND_ICON_SCRIPTPLUGINS = Blendish.BND_ICONID(18, 1);
        BND_ICON_SEQ_SEQUENCER = Blendish.BND_ICONID(0, 0);
        BND_ICON_SEQ_PREVIEW = Blendish.BND_ICONID(1, 0);
        BND_ICON_SEQ_LUMA_WAVEFORM = Blendish.BND_ICONID(2, 0);
        BND_ICON_SEQ_CHROMA_SCOPE = Blendish.BND_ICONID(3, 0);
        BND_ICON_SEQ_HISTOGRAM = Blendish.BND_ICONID(4, 0);
        BND_ICON_SEQ_SPLITVIEW = Blendish.BND_ICONID(5, 0);
        BND_ICON_IMAGE_RGB = Blendish.BND_ICONID(9, 0);
        BND_ICON_IMAGE_RGB_ALPHA = Blendish.BND_ICONID(10, 0);
        BND_ICON_IMAGE_ALPHA = Blendish.BND_ICONID(11, 0);
        BND_ICON_IMAGE_ZDEPTH = Blendish.BND_ICONID(12, 0);
        BND_ICON_IMAGEFILE = Blendish.BND_ICONID(13, 0);
    }
}

